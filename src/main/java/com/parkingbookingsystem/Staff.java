package com.parkingbookingsystem;

public class Staff extends Client {

    public Staff(String email, String password) {
        super(email, password, "Non-Faculty Staff", false);
    }
}