package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Client;
import com.parkingbookingsystem.Controller;

import java.util.List;

public class GetUnvalidatedClientsCommand implements Command<List<Client>> {

    private final Controller receiver;

    public GetUnvalidatedClientsCommand(Controller receiver) {
        this.receiver = receiver;
    }

    @Override
    public Result<List<Client>> execute() {
        return receiver.getUnvalidatedClients();
    }
}
