package com.parkingbookingsystem;

public class Student extends Client{

    public Student(String email, String password) {
        super(email, password, "Student", false);
    }
}
