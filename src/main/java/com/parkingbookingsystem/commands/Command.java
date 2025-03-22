package com.parkingbookingsystem.commands;

public interface Command<T> {
    Result<T> execute();
}