package com.parkingbookingsystem.commands;

public class Result<T> {
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T data) {
        this.result = data;
    }
}