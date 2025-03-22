package com.parkingbookingsystem.commands;

public class Result<T> {
    private T result;
    private String message;

    public T getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResult(T data) {
        this.result = data;
    }
}