package com.parkingbookingsystem;

public class Client extends User {
    private boolean isValidated;

    public Client(String email, String password, String type, boolean isValidated) {
        super(email, password, type);
        this.isValidated = isValidated;
    }

    @Override
    public boolean canLogin(String password) {
        return isValidated && super.canLogin(password);
    }

    public boolean isValidated() {
        return isValidated;
    }

    public void validate() {
        isValidated = true;
    }

    public void invalidate() {
        isValidated = false;
    }

    public double getRate() {
        switch (getType()) {
            case "Student":
                return 5;
            case "Faculty":
                return 8;
            case "Non-Faculty Staff":
                return 10;
            case "Visitor":
                return 15;
        
            default:
                return -1;
        }
    }
    public String[] serialize() {
        String[] s = super.serialize();
        return new String[]{s[0], s[1], s[2], String.valueOf(isValidated)};
    }

    public static Client deserialize(String[] data) {
        return new Client(data[0], data[1], data[2], Boolean.parseBoolean(data[3]));
    }
}
