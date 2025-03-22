package com.parkingbookingsystem;

public class DebitCardStrategy implements PaymentStrategy{

    @Override
    public boolean processPayment(Payment p) {
        // User Rest API to conduct the payment

        return true;
    }
}