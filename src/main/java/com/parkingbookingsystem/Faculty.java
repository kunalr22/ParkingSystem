package com.parkingbookingsystem;

public class Faculty extends Client {
    public static final String TYPE = "Faculty";

    public Faculty(String email, String password) {
        super(email, password, Faculty.TYPE, false);
    }

    public double getRate() {
        return 8;
    }
}