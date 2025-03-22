package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;
import com.parkingbookingsystem.User;

public class CreateUserCommand implements Command<User> {

    private final Controller receiver;
    private final String email;
    private final String password;
    private final String type;

    public CreateUserCommand(Controller reciever, String email, String password, String type) {
        this.receiver = reciever;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    @Override
    public Result<User> execute() {
        try {
            return receiver.createUser(email, password, type);
        } catch (IllegalArgumentException e) {
            Result<User> result = new Result<>();
            result.setResult(null);
            result.setMessage(e.getMessage());
            return result;
        }
    }
}
