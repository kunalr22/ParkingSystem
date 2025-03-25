package com.parkingbookingsystem.commands;

public class Invoker<T> {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Result executeCommand() {
        return command.execute();
    }
}
