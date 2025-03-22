package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;
import com.parkingbookingsystem.User;

import java.io.IOException;

public class GenerateManagerCommand implements Command<User> {
    private final Controller receiver;
    private String message;

    public GenerateManagerCommand(Controller controller) {
        this.receiver = controller;
    }

    @Override
    public Result<User> execute() {
        try {
            return receiver.generateManager();
        } catch (IOException e) {
            Result<User> result = new Result<>();
            result.setResult(null);
            result.setMessage(e.getMessage());
            return result;
        }
    }
}
