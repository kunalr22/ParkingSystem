package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;

public class CancelParkingSpaceBookingCommand implements Command<Void> {

    private final Controller receiver;
    private final String email;
    private final int parkingSpaceId;
    private final int parkingLotId;

    public CancelParkingSpaceBookingCommand(Controller receiver, String email, int parkingSpaceId, int parkingLotId) {
        this.receiver = receiver;
        this.email = email;
        this.parkingSpaceId = parkingSpaceId;
        this.parkingLotId = parkingLotId;
    }

    @Override
    public Result<Void> execute() {
        receiver.cancelParkingSpaceBooking(email, parkingLotId, parkingSpaceId);
        return null;
    }
}
