package com.parkingbookingsystem;
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
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment(0.0d, "hi!", 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) (short) 10, "hi!", (int) 'a');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult3 = controller0.getParkingLotList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 'a', "hi!", (int) '4');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 'a', "hi!", (-1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 10, "", (int) (byte) 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment(100.0d, "", (int) '4');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) (byte) 10, "", 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 1, "hi!", (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 0, "hi!", (int) (short) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        controller0.deleteUser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) (byte) -1, "hi!", (int) (byte) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = controller0.generateManager();
        controller0.cancelParkingSpaceBooking("hi!", (int) (byte) 1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) (-1.0f), "hi!", (-1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult11 = controller0.getBookingById((int) '#');
        controller0.enableParkingLotById((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment(100.0d, "hi!", (-1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult6 = controller0.getAvailableParkingSpaceList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 0L, "hi!", (int) (short) -1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) '#', "hi!", (int) (byte) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 10L, "hi!", (int) (short) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) (byte) 0, "hi!", (int) (short) 100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult13 = controller0.generateManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment(1.0d, "", 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult8 = controller0.getBookingById((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment(10.0d, "hi!", (int) '#');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = controller0.generateManager();
        controller0.cancelParkingSpaceBooking("hi!", (int) (byte) 1, (int) (byte) 100);
        controller0.disableParkingLotById((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 100, "", (int) (short) 100);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult9 = controller0.getUnvalidatedClients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 0, "hi!", 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult8 = controller0.getBookingById((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        controller0.addPayment((double) 0, "", 10);
    }
}

