package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;
import com.parkingbookingsystem.ParkingLot;

import java.util.List;

public class GetParkingLotListCommand implements Command<List<ParkingLot>> {

    private final Controller receiver;

    public GetParkingLotListCommand(Controller receiver) {
        this.receiver = receiver;
    }

    @Override
    public Result<List<ParkingLot>> execute() {
        return receiver.getParkingLotList();
    }
}
