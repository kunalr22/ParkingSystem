package com.parkingbookingsystem.commands;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Result executeCommand() {
        return command.execute();
    }
}
