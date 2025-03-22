package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Booking;
import com.parkingbookingsystem.Controller;

public class CheckInToBookingCommand implements Command<Void> {

    private final Controller receiver;
    private final Booking booking;

    public CheckInToBookingCommand(Controller receiver, Booking booking) {
        this.receiver = receiver;
        this.booking = booking;
    }

    @Override
    public Result<Void> execute() {
        receiver.checkIntoBooking(booking);
        return null;
    }
}
