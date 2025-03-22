package com.parkingbookingsystem;

public class Manager extends User {
    public static final String TYPE = "Manager";
    public Manager(String email, String password) {
        super(email, password, Manager.TYPE);
    }
}
