package com.parkingbookingsystem;
import java.util.Objects;

public class User {

    private String email, password, type;

    public User(String email, String password, String type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public boolean canLogin(String password) {
        return this.password.equals(password);
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }


    public User type(String type) {
        setType(type);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(type, user.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, type);
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", password='" + password + "'" +
            ", type='" + getType() + "'" +
            "}";
    }

    public String[] serialize() {
        return new String[] { email, password, type};
    }

    public static boolean passwordValid(String password) {
        return (password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[0-9].*") && 
                password.matches(".*[!@#$%^&*()].*"));
    }

    public static boolean emailValid(String email) {
        return email.contains("@") && email.contains(".");
    }
}
