package com.parkingbookingsystem;

public class Visitor extends Client {

    public Visitor(String email, String password) {
        super(email, password, "Visitor", true);
    }
}