package com.parkingbookingsystem.commands;

import com.parkingbookingsystem.Controller;

public class AddPaymentCommand implements Command<Void> {

    private final Controller receiver;
    private final double amount;
    private final String paymentMethod;
    private final int bookingId;

    public AddPaymentCommand(Controller controller, double amount, String paymentMethod, int bookingId) {
        this.receiver = controller;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.bookingId = bookingId;
    }

    @Override
    public Result<Void> execute() {
        receiver.addPayment(amount, paymentMethod, bookingId);
        return null;
    }
}
