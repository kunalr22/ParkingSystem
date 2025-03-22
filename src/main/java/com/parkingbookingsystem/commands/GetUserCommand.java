package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;
import com.parkingbookingsystem.User;

public class GetUserCommand implements Command<User> {

    private final Controller receiver;
    private final String email;

    public GetUserCommand(Controller receiver, String email) {
        this.receiver = receiver;
        this.email = email;
    }

    @Override
    public Result<User> execute() {
        return receiver.getUserById(email);
    }
}
