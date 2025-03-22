package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;

public class DeleteUserCommand implements Command<Void> {

    private final Controller receiver;
    private final String email;

    public DeleteUserCommand(Controller receiver, String email) {
        this.receiver = receiver;
        this.email = email;
    }

    @Override
    public Result<Void> execute() {
        receiver.deleteUser(email);
        return null;
    }
}
