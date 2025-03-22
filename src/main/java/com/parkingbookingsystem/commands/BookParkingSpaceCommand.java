package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;

import java.util.Date;

public class BookParkingSpaceCommand implements Command<Void> {

    private final Controller receiver;
    private final String email;
    private final int parkingSpaceId;
    private final int parkingLotId;
    private final String licensePlate;
    private final Date bookingStartTime;
    private final Date bookingEndTime;

    public BookParkingSpaceCommand(Controller receiver, String email, int parkingSpaceId, int parkingLotId, String licensePlate, Date value, Date value1) {
        this.receiver = receiver;
        this.email = email;
        this.parkingSpaceId = parkingSpaceId;
        this.parkingLotId = parkingLotId;
        this.licensePlate = licensePlate;
        this.bookingStartTime = value;
        this.bookingEndTime = value1;
    }

    @Override
    public Result<Void> execute() {
        receiver.bookParkingSpace(email, parkingSpaceId, parkingLotId, licensePlate, bookingStartTime, bookingEndTime);
        return null;
    }
}
