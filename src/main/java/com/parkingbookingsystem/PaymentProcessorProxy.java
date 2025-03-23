package com.parkingbookingsystem;

public class PaymentProcessorProxy implements PaymentProcessor {

    PaymentProcessor realPaymentProcessor = new RealPaymentProcessor();

    @Override
    public boolean processPayment(Payment p) {
        return realPaymentProcessor.processPayment(p);
    }
}
