package com.parkingbookingsystem;

public class Staff extends Client {

    public static final String TYPE = "Non-Faculty Staff";

    public Staff(String email, String password) {
        super(email, password, Staff.TYPE, false);
    }

    public double getRate() {
        return 10;
    }
}