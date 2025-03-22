package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;

public class CreateParkingLotCommand implements Command<Void> {

    private Controller receiver;
    private String location;

    public CreateParkingLotCommand(Controller receiver, String location) {
        this.receiver = receiver;
        this.location = location;
    }

    @Override
    public Result<Void> execute() {
        try {
            receiver.createParkingLot(location);
            return null;
        } catch (Exception e) {
            Result<Void> result = new Result<>();
            result.setMessage(e.getMessage());
            return result;
        }
    }
}
