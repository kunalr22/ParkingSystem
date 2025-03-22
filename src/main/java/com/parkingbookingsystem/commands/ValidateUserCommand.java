package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;

public class ValidateUserCommand implements Command<Void> {

    private final Controller receiver;
    private final String email;

    public ValidateUserCommand(Controller receiver, String email) {
        this.receiver = receiver;
        this.email = email;
    }

    @Override
    public Result<Void> execute() {

        receiver.validateUser(email);
        return null;
    }
}
