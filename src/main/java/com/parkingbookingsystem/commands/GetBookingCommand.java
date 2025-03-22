package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Booking;
import com.parkingbookingsystem.Controller;

public class GetBookingCommand implements Command<Booking> {

    private final Controller receiver;
    private final int id;

    public GetBookingCommand(Controller receiver, int id) {
        this.receiver = receiver;
        this.id = id;
    }

    @Override
    public Result<Booking> execute() {
        return receiver.getBookingById(id);
    }
}
