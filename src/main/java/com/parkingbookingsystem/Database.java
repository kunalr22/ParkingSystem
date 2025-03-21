package com.parkingbookingsystem;

import java.io.*;
import java.util.*;

public class Database {
    private static Database instance;
    private String baseFilePath = "Path/To/Database";
    private String delimiter = ",";
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private String getTableFilePath(String tableName) {
        return baseFilePath + "_" + tableName + ".csv";
    }

    public List<String[]> readAll(String tableName) throws IOException {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(getTableFilePath(tableName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line.split(delimiter));
            }
        }
        return records;
    }

    public void writeAll(String tableName, List<String[]> records) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getTableFilePath(tableName)))) {
            for (String[] record : records) {
                bw.write(String.join(delimiter, record));
                bw.newLine();
            }

        }
    }

    public void insert(String tableName, String[] record) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getTableFilePath(tableName), true))) {
            bw.write(String.join(delimiter, record));
            bw.newLine();
        }
    }

    public boolean update(String tableName, int rowIndex, String[] newRecord) throws IOException {
        List<String[]> records = readAll(tableName);
        if (rowIndex >= records.size()) {
            return false;
        }
        records.set(rowIndex, newRecord);
        writeAll(tableName, records);
        return true;
    }

    public boolean delete(String tableName, int rowIndex) throws IOException {
        List<String[]> records = readAll(tableName);
        if (rowIndex >= records.size()) {
            return false;
        }
        records.remove(rowIndex);
        writeAll(tableName, records);
        return true;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeAllSubscribers() {
        subscribers.clear();
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String tableName) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(tableName);
        }
    }
}