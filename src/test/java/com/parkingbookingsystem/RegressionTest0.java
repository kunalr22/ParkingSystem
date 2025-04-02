package com.parkingbookingsystem;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult5 = controller0.createUser("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", (int) (byte) 10, (int) (short) 0, "", date7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = controller0.createUser("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        com.parkingbookingsystem.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        controller0.modifyParkingSpaceBooking("hi!", 0, (int) (short) -1, (int) (byte) 10, "hi!", date12, date13);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult18 = controller0.createUser("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", 10, 0, "hi!", date8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        controller0.deleteUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult7 = controller0.getBookingsForUser("hi!");
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) '4', (int) (short) -1, "", date12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        controller0.modifyParkingSpaceBooking("hi!", 100, (int) ' ', (int) (short) -1, "hi!", date12, date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        controller0.modifyParkingSpaceBooking("", (int) (byte) -1, (int) (short) 0, (int) (short) 10, "", date11, date12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult19 = controller0.createUser("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult8 = controller0.getBookingsForUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (short) 100, (int) (short) 0, "", date16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult19 = controller0.createUser("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = controller0.createUser("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        controller0.deleteUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult7 = controller0.getParkingLotList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = controller0.getUserById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((-1));
        controller0.validateUser("hi!");
        controller0.enableParkingSpaceById((int) (byte) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.Booking booking13 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (short) 1, (int) (short) -1, "hi!", date12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (short) 10, (int) 'a', "hi!", date16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        controller0.enableParkingLotById((int) '#');
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (byte) 100, (int) '4', "hi!", date10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        com.parkingbookingsystem.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.Booking booking11 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("");
        java.lang.Class<?> wildcardClass3 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult13 = controller0.getBookingById((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (byte) 1, 1, "hi!", date14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult17 = controller0.getParkingLotById(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult17);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingLotById((int) '4');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult11 = controller0.getBookingById((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        controller0.disableParkingSpaceById(10, (int) (short) 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult6 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult7 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = controller0.getUserById("");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult16 = controller0.createUser("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = controller0.getUserById("");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult18 = controller0.createUser("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingLotById((int) '4');
        com.parkingbookingsystem.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult18 = controller0.getUserById("hi!");
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult22 = controller0.getUserById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult13 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult14 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult8 = controller0.getUserById("");
        com.parkingbookingsystem.Booking booking9 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        controller0.disableParkingSpaceById((int) 'a', 100);
        java.lang.Class<?> wildcardClass17 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult4 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.validateUser("hi!");
        controller0.disableParkingLotById(10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult8 = controller0.getParkingLotList();
        java.lang.Class<?> wildcardClass9 = parkingLotListResult8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        controller0.cancelParkingSpaceBooking("hi!", (int) '4', 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult11 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        java.lang.Class<?> wildcardClass5 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (short) 10, (int) (short) 10, "", date11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = controller0.getUserById("");
        java.lang.Class<?> wildcardClass13 = userResult12.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.deleteUser("hi!");
        controller0.enableParkingSpaceById((int) (short) 1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult9 = controller0.getBookingsForUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.deleteUser("hi!");
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", 0, (int) (short) -1, "hi!", date14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.enableParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        controller0.validateUser("");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        controller0.disableParkingSpaceById((int) 'a', 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult18 = controller0.getBookingById(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = null; // flaky: controller0.generateManager();
        controller0.enableParkingSpaceById(10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult20 = controller0.createUser("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        controller0.disableParkingSpaceById(10, (int) (short) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", 1, (-1), "", date10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (-1), (int) (short) 0, (int) (byte) 10, "hi!", date9, date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult6 = controller0.getBookingById((int) '4');
        controller0.enableParkingSpaceById((int) '4', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        controller0.modifyParkingSpaceBooking("hi!", 0, (int) (short) -1, (int) (byte) 10, "hi!", date12, date13);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", 10, (int) '4', "hi!", date19, date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = parkingLotResult5.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) ' ', 0, "", date13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult17 = null; // flaky: controller0.generateManager();
        java.util.Date date23 = null;
        java.util.Date date24 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) (byte) 10, (int) (byte) 0, 1, "", date23, date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult7 = controller0.getAvailableParkingSpaceList();
        java.lang.Class<?> wildcardClass8 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        controller0.disableParkingSpaceById((int) 'a', 100);
        // The following exception was thrown during execution in test generation
        try {
            controller0.addPayment((double) 10L, "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.getUserId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) (byte) 0, (int) (byte) 100, (int) '4', "hi!", date10, date11);
        controller0.enableParkingSpaceById(0, (int) (short) -1);
        controller0.enableParkingSpaceById(1, (int) (short) 10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult10 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        controller0.modifyParkingSpaceBooking("hi!", 0, (int) (short) -1, (int) (byte) 10, "hi!", date12, date13);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult16 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult18 = controller0.getBookingById(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", 100, 0, "", date8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult18 = controller0.getUserById("hi!");
        controller0.enableParkingSpaceById(100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult18);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult11 = controller0.getBookingById((int) '#');
        controller0.enableParkingLotById((int) '4');
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult12 = controller0.getParkingLotById(10);
        java.lang.Class<?> wildcardClass13 = parkingLotResult12.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) (byte) 100, (int) (short) -1, (int) (short) 10, "", date13, date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult13 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult14 = controller0.getParkingLotList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById((int) (short) 10);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", 0, (int) (short) 100, "hi!", date15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.enableParkingSpaceById((int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass8 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = controller0.createUser("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult7 = controller0.createUser("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("hi!", (int) (byte) 100, (int) (short) -1);
        com.parkingbookingsystem.Booking booking13 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = null; // flaky: controller0.generateManager();
        controller0.deleteUser("");
        com.parkingbookingsystem.Booking booking17 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult6 = controller0.getAvailableParkingSpaceList();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", 10, 1, "", date11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult6 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult8 = controller0.getBookingsForUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.enableParkingSpaceById((int) 'a', 1);
        controller0.cancelParkingSpaceBooking("", (int) (byte) 0, (int) (short) -1);
        controller0.disableParkingSpaceById((int) ' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        controller0.cancelParkingSpaceBooking("hi!", (int) (byte) 1, (int) (byte) 100);
// flaky:         controller0.createParkingLot("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (-1), 0);
        com.parkingbookingsystem.Booking booking25 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.disableParkingSpaceById((int) (byte) -1, (int) 'a');
// flaky:         controller0.createParkingLot("hi!");
        controller0.cancelParkingSpaceBooking("", 0, (int) (short) 0);
        controller0.disableParkingSpaceById((int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult23 = controller0.createUser("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult8 = controller0.getAvailableParkingSpaceList();
        java.lang.Class<?> wildcardClass9 = parkingSpaceListResult8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.cancelParkingSpaceBooking("", (int) ' ', (int) (short) 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (byte) 1);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult14 = controller0.getUnvalidatedClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult16 = controller0.createUser("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        controller0.cancelParkingSpaceBooking("hi!", (int) '4', 0);
        controller0.enableParkingSpaceById((int) (byte) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult11 = controller0.getUserById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult9 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = controller0.createUser("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult7 = controller0.getUserById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.cancelParkingSpaceBooking("", (int) (short) 100, 0);
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult10 = controller0.getUnvalidatedClients();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = controller0.createUser("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.disableParkingSpaceById((int) (byte) -1, (int) 'a');
// flaky:         controller0.createParkingLot("hi!");
        controller0.cancelParkingSpaceBooking("", 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult20 = controller0.createUser("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.validateUser("hi!");
        controller0.disableParkingLotById(10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult8 = controller0.getParkingLotList();
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) (byte) 1, (int) ' ', (int) (byte) 0, "", date14, date15);
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", (int) (byte) 1, (int) (byte) 10, "hi!", date21, date22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        controller0.deleteUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.disableParkingSpaceById((int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        controller0.disableParkingLotById((int) (byte) 0);
        controller0.validateUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult7 = controller0.getParkingLotById((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.disableParkingSpaceById((int) (byte) -1, (int) 'a');
// flaky:         controller0.createParkingLot("hi!");
        controller0.cancelParkingSpaceBooking("", 0, (int) (short) 0);
        controller0.disableParkingSpaceById((int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult23 = controller0.createUser("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.Booking booking17 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult6 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult8 = controller0.getUserById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.disableParkingSpaceById((int) (byte) -1, (int) 'a');
// flaky:         controller0.createParkingLot("hi!");
        controller0.cancelParkingSpaceBooking("", 0, (int) (short) 0);
        controller0.disableParkingLotById((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult22 = controller0.getBookingById((int) (short) 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult23 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult22);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult23);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult16 = controller0.getBookingById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult20 = controller0.createUser("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult16);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult8 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult10 = controller0.getBookingById((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult8 = controller0.getParkingLotById(100);
        controller0.disableParkingLotById((int) (byte) -1);
// flaky:         controller0.createParkingLot("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) '#', 0, "hi!", date15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", (int) (byte) 10, 0, "hi!", date17, date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        com.parkingbookingsystem.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById((int) (short) 10);
        controller0.deleteUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult13 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult14 = controller0.getParkingLotList();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (byte) -1, (int) '4', "hi!", date19, date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.enableParkingLotById((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((-1));
        controller0.validateUser("hi!");
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult11 = controller0.getBookingsForUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById((int) (short) 10);
        controller0.deleteUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult13 = controller0.getAvailableParkingSpaceList();
        controller0.cancelParkingSpaceBooking("hi!", 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult17 = controller0.getBookingById((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.enableParkingSpaceById((-1), 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult8 = controller0.getBookingById((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = controller0.getUserById("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = null; // flaky: controller0.generateManager();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult19 = controller0.createUser("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        controller0.validateUser("hi!");
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", (-1), 1, "", date27, date28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult7 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult16 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult17 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        controller0.disableParkingLotById((int) (byte) 0);
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) (short) 0, (int) (byte) 10, (int) '4', "hi!", date14, date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        controller0.enableParkingSpaceById(1, (int) (short) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult17 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult17);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult2 = controller0.getUnvalidatedClients();
        controller0.disableParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult5 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        controller0.deleteUser("");
        controller0.cancelParkingSpaceBooking("", (int) (short) 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.enableParkingSpaceById((int) 'a', 1);
        controller0.cancelParkingSpaceBooking("", (int) (byte) 0, (int) (short) -1);
        controller0.enableParkingSpaceById((int) (short) 100, (int) (short) 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult17 = controller0.getUserById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult24 = controller0.getUserById("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult25 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult25);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        controller0.modifyParkingSpaceBooking("", (int) (short) -1, 10, (int) ' ', "hi!", date17, date18);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        // The following exception was thrown during execution in test generation
        try {
            controller0.addPayment((double) 100.0f, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.getUserId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((int) (short) 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult4 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult5 = controller0.getParkingLotList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (-1), 0);
        java.lang.Class<?> wildcardClass25 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = controller0.getUserById("");
        controller0.enableParkingLotById(1);
// flaky:         controller0.createParkingLot("");
// flaky:         controller0.createParkingLot("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult11 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult12 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult13 = controller0.getUnvalidatedClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        controller0.enableParkingSpaceById((int) (short) 0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult25 = controller0.getBookingById((int) (short) 1);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult27 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult29 = controller0.getParkingLotById((int) (byte) 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult30 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult29);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult30);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult21 = controller0.getBookingsForUser("hi!");
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", (int) (byte) 100, 0, "hi!", date26, date27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult21);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult3 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult5 = controller0.getUserById("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult7 = controller0.getUserById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        controller0.modifyParkingSpaceBooking("", (int) (short) -1, 10, (int) ' ', "hi!", date17, date18);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult23 = controller0.createUser("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById((int) (short) 10);
        controller0.deleteUser("");
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) -1, (int) '#');
        controller0.deleteUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult5 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult3 = controller0.getParkingLotList();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (byte) 0, (-1), "hi!", date8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult3 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult5 = controller0.getUserById("hi!");
        java.lang.Class<?> wildcardClass6 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        controller0.enableParkingLotById((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.cancelParkingSpaceBooking("", (int) ' ', (int) (short) 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = controller0.getUserById("");
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) '#', (int) (byte) 1, "hi!", date20, date21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.cancelParkingSpaceBooking("", (int) (short) 100, 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult9 = controller0.getBookingsForUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult14 = controller0.getBookingsForUser("");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult18 = controller0.createUser("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult23 = controller0.getAvailableParkingSpaceList();
        controller0.deleteUser("");
        controller0.enableParkingSpaceById(0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult23);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        controller0.enableParkingSpaceById((int) (short) 0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult25 = controller0.getBookingById((int) (short) 1);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult26 = controller0.getParkingLotList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult26);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult11 = controller0.getParkingLotById((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult1 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult2 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult14 = controller0.getBookingsForUser("");
        controller0.enableParkingLotById(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult14);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = controller0.getUserById("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = null; // flaky: controller0.generateManager();
        controller0.enableParkingSpaceById((int) '4', (int) (short) 0);
        controller0.enableParkingSpaceById((int) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.cancelParkingSpaceBooking("", (int) ' ', (int) (short) 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = controller0.getUserById("");
        controller0.validateUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult23 = controller0.getAvailableParkingSpaceList();
        controller0.enableParkingLotById((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult23);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        controller0.deleteUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = controller0.getUserById("hi!");
        controller0.enableParkingLotById(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        controller0.cancelParkingSpaceBooking("", 100, 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult13 = controller0.getAvailableParkingSpaceList();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) (byte) 100, (int) 'a', (int) ' ', "", date19, date20);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult23 = controller0.getBookingById((-1));
        // The following exception was thrown during execution in test generation
        try {
            controller0.addPayment((double) 0.0f, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.getUserId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult23);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.cancelParkingSpaceBooking("", (int) (short) 100, 0);
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult11 = controller0.getParkingLotById(0);
        java.lang.Class<?> wildcardClass12 = parkingLotResult11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
// flaky:         controller0.createParkingLot("hi!");
        controller0.disableParkingSpaceById((int) '4', (int) (short) -1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult5 = controller0.getBookingsForUser("hi!");
        controller0.cancelParkingSpaceBooking("", (int) 'a', (int) (byte) 100);
        controller0.disableParkingSpaceById(0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.deleteUser("hi!");
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        controller0.modifyParkingSpaceBooking("hi!", 0, (int) '#', (int) (short) 100, "", date21, date22);
        controller0.enableParkingSpaceById((int) (byte) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById((int) (short) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.Booking booking13 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) (byte) 0, (int) (byte) 100, (int) '4', "hi!", date10, date11);
        controller0.enableParkingSpaceById(0, (int) (short) -1);
// flaky:         controller0.createParkingLot("");
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 10, (int) 'a');
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult5 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult7 = controller0.getBookingById(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult9 = controller0.getUnvalidatedClients();
        controller0.cancelParkingSpaceBooking("", (int) (short) -1, 100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.enableParkingLotById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult21 = controller0.createUser("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) (byte) 0, (int) (byte) 100, (int) '4', "hi!", date10, date11);
        controller0.enableParkingSpaceById(0, (int) (short) -1);
// flaky:         controller0.createParkingLot("");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult21 = controller0.createUser("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        controller0.deleteUser("");
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (byte) -1, (int) (short) 1, "", date15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.cancelParkingSpaceBooking("", (int) ' ', (int) (short) 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = controller0.getUserById("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult17 = controller0.getParkingLotById((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult17);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
// flaky:         controller0.createParkingLot("hi!");
        java.lang.Class<?> wildcardClass7 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        controller0.validateUser("");
        controller0.deleteUser("");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult21 = controller0.createUser("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
        controller0.deleteUser("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult9 = controller0.getParkingLotById(0);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        controller0.modifyParkingSpaceBooking("hi!", (-1), (-1), (int) (short) 1, "hi!", date15, date16);
        controller0.validateUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.deleteUser("hi!");
// flaky:         controller0.createParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult21 = controller0.getBookingsForUser("hi!");
        controller0.enableParkingLotById((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult21);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult6 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult8 = controller0.getBookingById((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult16 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult17 = controller0.getUnvalidatedClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (-1), 0);
        java.util.Date date30 = null;
        java.util.Date date31 = null;
        controller0.modifyParkingSpaceBooking("", (-1), (int) (short) 100, (int) (byte) -1, "hi!", date30, date31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.cancelParkingSpaceBooking("", (int) ' ', (int) (short) 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById(100);
        controller0.disableParkingSpaceById(1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = controller0.getUserById("");
        controller0.enableParkingLotById(1);
        controller0.enableParkingSpaceById(1, (int) (short) 10);
// flaky:         controller0.createParkingLot("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        controller0.cancelParkingSpaceBooking("hi!", (int) (byte) 1, (int) (byte) 100);
        controller0.disableParkingLotById((int) (byte) 0);
        controller0.deleteUser("");
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", (int) (short) 100, (int) 'a', "hi!", date16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult5 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult16 = controller0.getParkingLotList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult16);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) (byte) 0, (int) (byte) 100, (int) '4', "hi!", date10, date11);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult14 = controller0.getBookingsForUser("hi!");
        controller0.validateUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((int) (short) 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult4 = controller0.getParkingLotList();
// flaky:         controller0.createParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.cancelParkingSpaceBooking("", (int) (short) 100, 0);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult10 = controller0.getUnvalidatedClients();
// flaky:         controller0.createParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult3 = controller0.getBookingsForUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        controller0.modifyParkingSpaceBooking("", (int) (short) -1, 10, (int) ' ', "hi!", date17, date18);
        controller0.cancelParkingSpaceBooking("", (int) (short) -1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.enableParkingSpaceById((int) (byte) 10, (int) '4');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult9 = controller0.getUserById("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult11 = controller0.getUserById("");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = controller0.createUser("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult5 = controller0.getBookingsForUser("hi!");
        controller0.cancelParkingSpaceBooking("", (int) 'a', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult13 = controller0.createUser("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        controller0.disableParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult10 = controller0.getBookingById((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = controller0.getUserById("");
        controller0.disableParkingSpaceById(10, (int) (short) 0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult15 = controller0.getBookingById((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.lang.Class<?> wildcardClass4 = parkingLotResult3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult18 = controller0.getUserById("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult20 = controller0.getUserById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult20);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult6 = controller0.createUser("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult22 = controller0.getBookingById((int) (short) 1);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult24 = controller0.getBookingsForUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult24);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        controller0.modifyParkingSpaceBooking("", (int) (short) -1, 10, (int) ' ', "hi!", date17, date18);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult21 = controller0.getUnvalidatedClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult6 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.disableParkingSpaceById((int) (byte) -1, (int) 'a');
// flaky:         controller0.createParkingLot("hi!");
        controller0.cancelParkingSpaceBooking("", 0, (int) (short) 0);
        controller0.disableParkingSpaceById((int) (byte) 0, (int) (byte) -1);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        controller0.enableParkingSpaceById((int) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = null; // flaky: controller0.generateManager();
        controller0.cancelParkingSpaceBooking("hi!", 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = null; // flaky: controller0.generateManager();
        controller0.validateUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.cancelParkingSpaceBooking("", (int) (short) 100, 0);
        controller0.deleteUser("hi!");
// flaky:         controller0.createParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult24 = controller0.getParkingLotById((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult24);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.enableParkingSpaceById((int) (byte) 10, (int) '4');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult9 = controller0.getUserById("hi!");
        controller0.enableParkingSpaceById((int) (short) 0, 100);
        controller0.deleteUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
        controller0.validateUser("");
        com.parkingbookingsystem.Booking booking11 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.cancelParkingSpaceBooking("", (int) (short) 100, 0);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult10 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.Booking booking11 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult2 = controller0.getUnvalidatedClients();
        controller0.disableParkingLotById(10);
        com.parkingbookingsystem.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.cancelParkingSpaceBooking("", (int) ' ', (int) (short) 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById(100);
        controller0.disableParkingLotById(100);
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", 100, 0, "hi!", date20, date21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
// flaky:         controller0.createParkingLot("");
// flaky:         controller0.createParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult11 = controller0.getParkingLotById((int) (byte) 1);
        controller0.validateUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.enableParkingSpaceById(1, (int) (byte) -1);
// flaky:         controller0.createParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult2 = controller0.getUnvalidatedClients();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        controller0.modifyParkingSpaceBooking("", (int) ' ', (int) (short) 10, (int) (short) 100, "", date8, date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingLotById((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult7 = controller0.getAvailableParkingSpaceList();
        controller0.enableParkingSpaceById((int) (byte) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) (short) 10, (int) (short) 1, (int) (short) 100, "hi!", date13, date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult8 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult9 = null; // flaky: controller0.generateManager();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult13 = controller0.createUser("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.disableParkingLotById((int) (short) -1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult12 = controller0.getBookingsForUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) -1);
        controller0.enableParkingSpaceById(1, (int) (short) 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult18 = controller0.getBookingById((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult18);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult22 = controller0.getBookingById((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult22);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingSpaceById((int) '4', (int) 'a');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = controller0.getUserById("");
        controller0.disableParkingSpaceById(10, (int) (short) 0);
        controller0.enableParkingLotById((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        controller0.disableParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.Booking booking9 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult20 = controller0.getParkingLotList();
        controller0.validateUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult23 = controller0.getAvailableParkingSpaceList();
        controller0.deleteUser("");
        java.util.Date date30 = null;
        java.util.Date date31 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", (int) ' ', (int) (short) 10, "hi!", date30, date31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult23);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult11 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.enableParkingSpaceById((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', (int) (short) 10);
        controller0.deleteUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult21 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult21);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        controller0.disableParkingSpaceById(10, (int) (short) 10);
        controller0.enableParkingSpaceById((int) ' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        controller0.validateUser("hi!");
        controller0.disableParkingSpaceById((int) (short) 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.cancelParkingSpaceBooking("", (int) (short) 100, 0);
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult10 = controller0.getUnvalidatedClients();
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) '4', (int) (short) 100, (int) (byte) 100, "", date16, date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((int) (short) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult5 = controller0.getBookingById((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        controller0.cancelParkingSpaceBooking("hi!", (int) (byte) 1, (int) (byte) 100);
        controller0.disableParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult11 = controller0.getBookingsForUser("hi!");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult9 = controller0.getUnvalidatedClients();
        controller0.cancelParkingSpaceBooking("", (int) (short) -1, 100);
// flaky:         controller0.createParkingLot("hi!");
// flaky:         controller0.createParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        java.util.Date date22 = null;
        java.util.Date date23 = null;
        controller0.modifyParkingSpaceBooking("", (int) (short) 1, (int) '4', 0, "hi!", date22, date23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult9 = controller0.getUnvalidatedClients();
        controller0.cancelParkingSpaceBooking("", (int) (short) -1, 100);
        controller0.disableParkingSpaceById((int) (byte) -1, (int) (short) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult18 = controller0.getUserById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult18);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult11 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult12 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult14 = controller0.getBookingsForUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult16 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult18 = controller0.getBookingsForUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult18);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult9 = controller0.getUnvalidatedClients();
        controller0.cancelParkingSpaceBooking("", (int) (short) -1, 100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.enableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult19 = controller0.getParkingLotById(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult19);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        controller0.enableParkingSpaceById(1, (int) (byte) -1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult7 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        controller0.validateUser("");
        controller0.enableParkingLotById((int) (byte) 0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult19 = controller0.getBookingById((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((-1));
        controller0.validateUser("hi!");
        controller0.cancelParkingSpaceBooking("hi!", (int) '#', 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult11 = controller0.getUserById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult7 = controller0.getAvailableParkingSpaceList();
        controller0.deleteUser("hi!");
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        controller0.modifyParkingSpaceBooking("", 0, (int) 'a', (int) (short) 0, "", date15, date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult14 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult15 = controller0.getParkingLotList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult9 = controller0.getUnvalidatedClients();
        controller0.cancelParkingSpaceBooking("", (int) (short) -1, 100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.enableParkingLotById((int) 'a');
        controller0.enableParkingSpaceById((int) (short) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.disableParkingLotById(0);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        controller0.modifyParkingSpaceBooking("", (int) (byte) 10, (int) (byte) 10, 0, "hi!", date15, date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult6 = controller0.getUserById("");
        java.lang.Class<?> wildcardClass7 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult11 = controller0.getParkingLotById((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = controller0.getUserById("");
        controller0.disableParkingSpaceById(10, (int) (short) 0);
        com.parkingbookingsystem.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.setCheckInTime(java.util.Date)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult5 = controller0.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult2 = controller0.getBookingsForUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult4 = controller0.getBookingsForUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult8 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult10 = controller0.getBookingById((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        controller0.cancelParkingSpaceBooking("", (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult6 = controller0.getBookingsForUser("hi!");
        controller0.disableParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult10 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult12 = controller0.getBookingById((int) (short) 0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult16 = controller0.getUnvalidatedClients();
        controller0.cancelParkingSpaceBooking("", 100, 0);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) (short) 100, (int) 'a', "", date25, date26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult16);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        controller0.enableParkingSpaceById((-1), (int) (byte) 10);
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult10 = controller0.getUserById("");
        controller0.enableParkingSpaceById(1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult8 = controller0.getParkingLotById((int) ' ');
        controller0.enableParkingSpaceById((int) (short) 10, (int) ' ');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult6 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult7 = null; // flaky: controller0.generateManager();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("hi!");
        controller0.enableParkingSpaceById((int) (byte) 10, (int) '4');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult9 = controller0.getUserById("hi!");
        controller0.enableParkingSpaceById((int) (short) 0, 100);
        controller0.enableParkingLotById((int) (short) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult16 = controller0.getBookingById((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.disableParkingLotById((int) (short) 10);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult4 = controller0.getParkingLotList();
        controller0.disableParkingLotById(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult5 = controller0.getParkingLotById((int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult10 = controller0.getUnvalidatedClients();
        controller0.disableParkingLotById(1);
        controller0.disableParkingLotById((int) ' ');
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("hi!", (int) 'a', 100, (int) (byte) 1, "hi!", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (byte) 1);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult15 = controller0.getBookingsForUser("hi!");
        controller0.validateUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult15);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(10);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        controller0.modifyParkingSpaceBooking("", 10, 0, (int) (short) 1, "", date9, date10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult13 = controller0.getParkingLotById((int) (short) 10);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        controller0.cancelParkingSpaceBooking("hi!", (int) (short) 1, (int) ' ');
        controller0.enableParkingSpaceById((int) (short) 0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult25 = controller0.getBookingById((int) (short) 1);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult27 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult28 = null; // flaky: controller0.generateManager();
        java.util.Date date33 = null;
        java.util.Date date34 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("hi!", (int) '4', (int) (byte) 1, "", date33, date34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult27);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult28);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        controller0.cancelParkingSpaceBooking("hi!", (int) (byte) 1, (int) (byte) 100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult8 = null; // flaky: controller0.generateManager();
// flaky:         controller0.createParkingLot("hi!");
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("", (int) '#', 10, "hi!", date15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.enableParkingSpaceById((int) 'a', 1);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult9 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult11 = controller0.getBookingById((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult5 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult6 = controller0.getParkingLotList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        controller0.validateUser("");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult8 = controller0.getUnvalidatedClients();
        controller0.deleteUser("");
        controller0.enableParkingSpaceById((int) '#', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
// flaky:         controller0.createParkingLot("");
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) (byte) 0, (int) (byte) 100, (int) '4', "hi!", date10, date11);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult14 = controller0.getBookingsForUser("hi!");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult15 = controller0.getParkingLotList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult15);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult1 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult3 = controller0.getParkingLotById(1);
// flaky:         controller0.createParkingLot("");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult6 = null; // flaky: controller0.generateManager();
        controller0.deleteUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult3 = null; // flaky: controller0.generateManager();
        controller0.cancelParkingSpaceBooking("hi!", (int) (byte) 1, (int) (byte) 100);
        controller0.disableParkingLotById((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult3);
    }
}
