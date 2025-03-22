package com.parkingbookingsystem;

public class SuperManager extends User {

    private static SuperManager instance;
    public static final String TYPE = "Super Manager";

    private SuperManager(String email, String password) {
        super(email, password, SuperManager.TYPE);
    }

    public static SuperManager getInstance(String email, String password) {
        if (instance == null) {
            instance = new SuperManager(email, password);
        }
        return instance;
    }
}
