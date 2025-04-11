package com.randooptests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.parkingbookingsystem.PaymentProcessorProxy paymentProcessorProxy0 = new com.parkingbookingsystem.PaymentProcessorProxy();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str7 = payment6.getUserId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = paymentProcessorProxy0.processPayment(payment6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        payment5.ProcessPayment();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.parkingbookingsystem.RealPaymentProcessor realPaymentProcessor0 = new com.parkingbookingsystem.RealPaymentProcessor();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment6.setAmount((double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = realPaymentProcessor0.processPayment(payment6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        payment5.ProcessPayment();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.parkingbookingsystem.PaymentProcessorProxy paymentProcessorProxy0 = new com.parkingbookingsystem.PaymentProcessorProxy();
        com.parkingbookingsystem.Payment payment7 = new com.parkingbookingsystem.Payment((int) (byte) 0, "", (int) (byte) 10, (double) ' ', "hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = paymentProcessorProxy0.processPayment(payment7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.parkingbookingsystem.commands.Invoker invoker0 = new com.parkingbookingsystem.commands.Invoker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.parkingbookingsystem.commands.Result result1 = invoker0.executeCommand();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.parkingbookingsystem.PaymentProcessorProxy paymentProcessorProxy0 = new com.parkingbookingsystem.PaymentProcessorProxy();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment6.setAmount((double) 1);
        java.lang.String str9 = payment6.getStatus();
        com.parkingbookingsystem.Payment payment11 = payment6.paymentMethod("Visitor");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = paymentProcessorProxy0.processPayment(payment11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.parkingbookingsystem.PaymentProcessorProxy paymentProcessorProxy0 = new com.parkingbookingsystem.PaymentProcessorProxy();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.getPaymentMethod();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = paymentProcessorProxy0.processPayment(payment6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.parkingbookingsystem.RealPaymentProcessor realPaymentProcessor0 = new com.parkingbookingsystem.RealPaymentProcessor();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment6.setAmount((double) 1);
        com.parkingbookingsystem.Payment payment10 = payment6.amount((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = realPaymentProcessor0.processPayment(payment6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand getUnvalidatedClientsCommand4 = new com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand(controller0);
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand8 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, 1.0d, "Faculty", 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult9 = addPaymentCommand8.execute();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand4 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, (double) 10L, "hi!", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult5 = addPaymentCommand4.execute();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.parkingbookingsystem.RealPaymentProcessor realPaymentProcessor0 = new com.parkingbookingsystem.RealPaymentProcessor();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment6.setAmount((double) 1);
        java.lang.String str9 = payment6.getStatus();
        com.parkingbookingsystem.Payment payment11 = payment6.paymentMethod("Visitor");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = realPaymentProcessor0.processPayment(payment6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.parkingbookingsystem.PaymentProcessorProxy paymentProcessorProxy0 = new com.parkingbookingsystem.PaymentProcessorProxy();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", (int) (short) -1, (double) ' ', "", "Faculty");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = paymentProcessorProxy0.processPayment(payment6);
    }
}

