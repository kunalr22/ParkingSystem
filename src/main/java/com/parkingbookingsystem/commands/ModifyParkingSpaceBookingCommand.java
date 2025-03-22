package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;

import java.util.Date;

public class ModifyParkingSpaceBookingCommand implements Command<Void> {

    private final Controller receiver;
    private final String email;
    private final int parkingSpaceId;
    private final int parkingLotId;
    private final String licensePlate;
    private final Date newFrom;
    private final Date newTo;

    public ModifyParkingSpaceBookingCommand(Controller receiver, String email, int parkingSpaceId, int parkingLotId, String licensePlate, Date newFrom, Date newTo) {
        this.receiver = receiver;
        this.email = email;
        this.parkingSpaceId = parkingSpaceId;
        this.parkingLotId = parkingLotId;
        this.licensePlate = licensePlate;
        this.newFrom = newFrom;
        this.newTo = newTo;
    }

    @Override
    public Result<Void> execute() {
        receiver.modifyParkingSpaceBooking(email, parkingSpaceId, parkingLotId, licensePlate, newFrom, newTo);
        return null;
    }
}
