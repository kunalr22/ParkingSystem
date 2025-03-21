package com.parkingbookingsystem;

public class UserFactory {

    public User createUser(String... params) {
        String email = params[0];
        String password = params[1];
        String type = params[2];
        boolean isValidated = false;
        if (params.length > 3) {
            isValidated = Boolean.parseBoolean(params[3]);
        }
        // manager
        if (type.equalsIgnoreCase("Manager")) {
            return new Manager(email, password);
        } else if (type.equalsIgnoreCase("Super Manager")) {
            return SuperManager.getInstance(email, password);
        } 
        // not a manager
        Client newClient;
        if (type.equalsIgnoreCase("Non-Faculty Staff")) {
            newClient = new Staff(email, password);
        } else if (type.equalsIgnoreCase("Student")) {
            newClient = new Student(email, password);
        } else if (type.equalsIgnoreCase("Visitor")) {
            newClient = new Visitor(email, password);
        } else if (type.equalsIgnoreCase("Faculty")) {
            newClient = new Faculty(email, password);
        } else {
            return null; // bad user type
        }
        if (isValidated) {
            newClient.validate();
        }
        return newClient;
    }
}
