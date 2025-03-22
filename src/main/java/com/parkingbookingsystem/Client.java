package com.parkingbookingsystem;

public abstract class Client extends User {
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

    public abstract double getRate();

    public String[] serialize() {
        String[] s = super.serialize();
        return new String[]{s[0], s[1], s[2], String.valueOf(isValidated)};
    }
}
