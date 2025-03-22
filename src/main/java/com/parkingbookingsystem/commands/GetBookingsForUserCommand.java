package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Booking;
import com.parkingbookingsystem.Controller;

import java.util.List;

public class GetBookingsForUserCommand implements Command<List<Booking>> {

    private final Controller receiver;
    private final String email;

    public GetBookingsForUserCommand(Controller receiver, String email) {
        this.receiver = receiver;
        this.email = email;
    }

    @Override
    public Result<List<Booking>> execute() {
        return receiver.getBookingsForUser(email);
    }
}
