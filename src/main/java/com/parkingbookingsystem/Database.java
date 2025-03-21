package com.parkingbookingsystem;

import java.io.*;
import java.util.*;

public class Database {
    private static Database instance;
    private String baseFilePath;
    private String delimiter = ",";

    private Database(String baseFilePath) {
        this.baseFilePath = baseFilePath;
    }

    public static Database getInstance(String baseFilePath) {
        if (instance == null) {
            instance = new Database(baseFilePath);
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
}