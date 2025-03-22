package com.parkingbookingsystem;

public class Visitor extends Client {

    public static final String TYPE = "Visitor";

    public Visitor(String email, String password) {
        super(email, password, Visitor.TYPE, true);
    }

    public double getRate() {
        return 15;
    }
}