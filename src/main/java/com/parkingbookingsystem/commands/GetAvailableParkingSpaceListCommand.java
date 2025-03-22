package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;
import com.parkingbookingsystem.ParkingSpace;

import java.util.List;

public class GetAvailableParkingSpaceListCommand implements Command<List<ParkingSpace>> {

    private final Controller receiver;

    public GetAvailableParkingSpaceListCommand(Controller receiver) {
        this.receiver = receiver;
    }

    @Override
    public Result<List<ParkingSpace>> execute() {
        return receiver.getAvailableParkingSpaceList();
    }
}
