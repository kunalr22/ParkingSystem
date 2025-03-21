package com.parkingbookingsystem;

public class SuperManager extends User {

    private static SuperManager instance;

    private SuperManager(String email, String password) {
        super(email, password, "Super Manager");
    }

    public static SuperManager getInstance(String email, String password) {
        if (instance == null) {
            instance = new SuperManager(email, password);
        }
        return instance;
    }
}
