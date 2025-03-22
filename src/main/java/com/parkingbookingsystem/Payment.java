package com.parkingbookingsystem;
import java.util.Objects;

public class Payment {
    private static int counter = 100;
    private final int paymentId, bookingId;
    private double amount;
    private final String userId;
    private String status, paymentMethod; // Method can be: credit card, debit card, status: paid, pending, failed
    public static final String[] PAYMENT_TYPES = {"Credit Card", "Debit Card", "E-Transfer"};

    public Payment(String userId, int bookingId, double amount, String status, String paymentMethod) {
        this.paymentId = ++counter;
        this.userId = userId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public Payment(int paymentId, String userId, int bookingId, double amount, String status, String paymentMethod) {
        if (counter < paymentId) counter = paymentId;
        this.paymentId = paymentId;
        this.userId = userId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public void ProcessPayment() {
        PaymentProcessorProxy p = new PaymentProcessorProxy();
        if (p.processPayment(this))
            status = "paid";
        else
            status = "failed";
    }

    public int getPaymentId() {
        return this.paymentId;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getBookingId() {
        return this.bookingId;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public Payment amount(double amount) {
        setAmount(amount);
        return this;
    }

    public Payment status(String status) {
        setStatus(status);
        return this;
    }

    public Payment paymentMethod(String paymentMethod) {
        setPaymentMethod(paymentMethod);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) o;
        return paymentId == payment.paymentId && userId == payment.userId && bookingId == payment.bookingId && amount == payment.amount && Objects.equals(status, payment.status) && Objects.equals(paymentMethod, payment.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, userId, bookingId, amount, status, paymentMethod);
    }

    @Override
    public String toString() {
        return "{" +
            " paymentId='" + getPaymentId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", bookingId='" + getBookingId() + "'" +
            ", amount='" + getAmount() + "'" +
            ", status='" + getStatus() + "'" +
            ", paymentMethod='" + getPaymentMethod() + "'" +
            "}";
    }

    public String[] serialize() {
        return new String[] { 
            Integer.toString(paymentId), 
            userId, 
            Integer.toString(bookingId), 
            Double.toString(amount), 
            status, 
            paymentMethod 
        };
    }

    public static Payment deserialize(String[] data) {
        return new Payment(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]), data[4], data[5]);
    }
}
