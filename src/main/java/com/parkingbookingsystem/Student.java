package com.parkingbookingsystem;

public class Student extends Client{

    public static final String TYPE = "Student";

    public Student(String email, String password) {
        super(email, password, Student.TYPE, false);
    }

    public double getRate() {
        return 5;
    }
}
