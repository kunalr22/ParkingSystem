package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;
import com.parkingbookingsystem.ParkingLot;

public class GetParkingLotByIdCommand implements Command<ParkingLot> {

    private final Controller receiver;
    private final int id;

    public GetParkingLotByIdCommand(Controller controller, int id) {
        this.receiver = controller;
        this.id = id;
    }

    @Override
    public Result<ParkingLot> execute() {
        return receiver.getParkingLotById(id);
    }
}
