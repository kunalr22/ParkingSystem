package com.parkingbookingsystem;

public interface PaymentStrategy {
    boolean processPayment(Payment p);
}
