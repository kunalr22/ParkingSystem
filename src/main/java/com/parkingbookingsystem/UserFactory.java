package com.parkingbookingsystem;

public class UserFactory {

    public static User createUser(String... params) {
        String email = params[0];
        String password = params[1];
        String type = params[2];
        boolean isValidated = false;
        if (params.length > 3) {
            isValidated = Boolean.parseBoolean(params[3]);
        }

        User newUser;

        switch (type) {
            case SuperManager.TYPE -> newUser = SuperManager.getInstance(email, password);
            case Manager.TYPE -> newUser = new Manager(email, password);
            case Staff.TYPE -> newUser = new Staff(email, password);
            case Student.TYPE -> newUser = new Student(email, password);
            case Visitor.TYPE -> newUser = new Visitor(email, password);
            case Faculty.TYPE -> newUser = new Faculty(email, password);
            default -> {
                return null; // bad user type
            }
        }
        if (isValidated && newUser instanceof Client) {
            ((Client) newUser).validate();
        }
        return newUser;
    }

    public static String[] getAllClientTypes() {
        return new String[] {Staff.TYPE, Student.TYPE, Visitor.TYPE, Faculty.TYPE};
    }
}
