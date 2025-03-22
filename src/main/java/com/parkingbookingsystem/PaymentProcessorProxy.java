package com.parkingbookingsystem;

public class PaymentProcessorProxy {
    private PaymentStrategy strategy = null;
    
    public boolean processPayment(Payment p) {
        switch (p.getPaymentMethod()) {
            case "Credit Card":
                strategy = new CreditCardStrategy();
                break;
            case "Debit Card":
                strategy = new DebitCardStrategy();
                break;
            case "E-Transfer":
                strategy = new EtransferStrategy();
        }
        return strategy.processPayment(p);
    }
}
