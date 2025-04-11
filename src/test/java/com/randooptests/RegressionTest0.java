package com.randooptests;

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
        com.parkingbookingsystem.PaymentProcessorProxy paymentProcessorProxy0 = new com.parkingbookingsystem.PaymentProcessorProxy();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.parkingbookingsystem.Controller controller0 = null;
        com.parkingbookingsystem.commands.CreateParkingLotCommand createParkingLotCommand2 = new com.parkingbookingsystem.commands.CreateParkingLotCommand(controller0, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = com.parkingbookingsystem.Student.TYPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Student" + "'", str0.equals("Student"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            controller0.addPayment((double) (byte) -1, "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.getUserId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = com.parkingbookingsystem.Staff.TYPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Non-Faculty Staff" + "'", str0.equals("Non-Faculty Staff"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.parkingbookingsystem.RealPaymentProcessor realPaymentProcessor0 = new com.parkingbookingsystem.RealPaymentProcessor();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult19 = checkInToBookingCommand18.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.ParkingLot.getParkingSpaceById(int)\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment((int) (byte) 0, "", (int) (byte) 10, (double) ' ', "hi!", "");
        java.lang.String str7 = payment6.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        boolean boolean1 = com.parkingbookingsystem.User.clientEmailValid("Visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String str3 = visitor2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{ email='', password='hi!', type='Visitor' }" + "'", str3.equals("{ email='', password='hi!', type='Visitor' }"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult4 = controller0.createUser("hi!", "Visitor", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand4 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, (double) 10L, "hi!", (int) (short) 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        com.parkingbookingsystem.Booking booking20 = booking16.licensePlate("Non-Faculty Staff");
        // The following exception was thrown during execution in test generation
        try {
            double double21 = booking16.getRemainingAmount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"this.checkInTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking20);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str0 = com.parkingbookingsystem.Faculty.TYPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Faculty" + "'", str0.equals("Faculty"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str6 = payment5.getUserId();
        payment5.setAmount((double) 0L);
        payment5.setAmount((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean1 = com.parkingbookingsystem.User.passwordValid("Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingSpaceId();
        double double14 = booking12.getDepositAmount();
        java.util.Date date15 = null;
        booking12.setCheckInTime(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
// flaky:         controller0.createParkingLot("Faculty");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand getUnvalidatedClientsCommand4 = new com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand(controller0);
        com.parkingbookingsystem.commands.GetBookingsForUserCommand getBookingsForUserCommand6 = new com.parkingbookingsystem.commands.GetBookingsForUserCommand(controller0, "Visitor");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult7 = getBookingsForUserCommand6.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.parkingbookingsystem.commands.Invoker invoker0 = new com.parkingbookingsystem.commands.Invoker();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand20 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "{ email='', password='hi!', type='Visitor'}", (int) 'a', (int) '4', (int) (byte) 0, "{ email='', password='hi!', type='Visitor'}", date18, date19);
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand28 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "Student", 10, (int) (byte) 1, 1, "hi!", date26, date27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 1);
        booking12.setStatus("");
        booking12.setStatus("Non-Faculty Staff");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand17 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        controller0.disableParkingSpaceById((int) (short) 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        com.parkingbookingsystem.User user3 = userResult2.getResult();
        userResult2.setMessage("Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand17 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        java.util.Date date22 = null;
        java.util.Date date23 = null;
        // The following exception was thrown during execution in test generation
        try {
            controller0.bookParkingSpace("{ email='', password='hi!', type='Visitor'}", (int) ' ', (int) (short) -1, "hi!", date22, date23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        boolean boolean1 = com.parkingbookingsystem.User.passwordValid("Non-Faculty Staff");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        java.util.List<com.parkingbookingsystem.ParkingSpace> parkingSpaceList2 = parkingLot1.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand2 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (int) '4');
        com.parkingbookingsystem.commands.GenerateManagerCommand generateManagerCommand3 = new com.parkingbookingsystem.commands.GenerateManagerCommand(controller0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.parkingbookingsystem.Sensor sensor2 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        int int3 = sensor2.getParkingSpaceId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        com.parkingbookingsystem.Controller controller19 = new com.parkingbookingsystem.Controller();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        com.parkingbookingsystem.Booking booking32 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date26, date27, date28, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date33 = null;
        booking32.setStartTime(date33);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand35 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller19, booking32);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand36 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking32);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult38 = controller0.getBookingById((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult38);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String[]> strArrayList2 = database0.readAll("{ email='', password='hi!', type='Visitor'}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: src/main/java/data/DB_{ email='', password='hi!', type='Visitor'}.csv (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        com.parkingbookingsystem.User user3 = userResult2.getResult();
        userResult2.setMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 1);
        booking12.setRemainingAmount((double) (byte) 100);
        booking12.setUserId("Student");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.parkingbookingsystem.Sensor sensor2 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        int int3 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.parkingbookingsystem.Manager manager2 = new com.parkingbookingsystem.Manager("Faculty", "{ email='', password='hi!', type='Visitor'}");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        com.parkingbookingsystem.Booking booking13 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date7, date8, date9, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date14 = null;
        booking13.setStartTime(date14);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand16 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking13);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult20 = controller0.createUser("{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", "{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus6 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OCCUPIED;
        parkingSpace3.setStatus(parkingStatus6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + parkingStatus6 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OCCUPIED + "'", parkingStatus6.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OCCUPIED));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        java.lang.String str2 = parkingLot1.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Student" + "'", str2.equals("Student"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        com.parkingbookingsystem.Booking booking14 = booking12.depositAmount((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("hi!", "");
        staff2.validate();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        java.lang.String str6 = parkingSpace3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        com.parkingbookingsystem.Controller controller19 = new com.parkingbookingsystem.Controller();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        com.parkingbookingsystem.Booking booking32 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date26, date27, date28, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date33 = null;
        booking32.setStartTime(date33);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand35 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller19, booking32);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand36 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking32);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult37 = checkInToBookingCommand36.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.ParkingLot.getParkingSpaceById(int)\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.parkingbookingsystem.Manager manager2 = new com.parkingbookingsystem.Manager("", "Non-Faculty Staff");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingSpaceId();
        double double14 = booking12.getDepositAmount();
        com.parkingbookingsystem.Booking booking16 = booking12.parkingLotId((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        com.parkingbookingsystem.Payment payment9 = payment5.status("Visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        java.lang.String str8 = payment5.getStatus();
        com.parkingbookingsystem.Payment payment10 = payment5.paymentMethod("Visitor");
        java.lang.String str11 = payment10.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Visitor" + "'", str11.equals("Visitor"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingSpaceId();
        double double14 = booking12.getDepositAmount();
        java.lang.String str15 = booking12.getUserId();
        java.util.Date date16 = booking12.getCheckInTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        com.parkingbookingsystem.User user3 = userResult2.getResult();
        com.parkingbookingsystem.User user7 = new com.parkingbookingsystem.User("Non-Faculty Staff", "", "Non-Faculty Staff");
        user7.setPassword("Faculty");
        userResult2.setResult(user7);
        java.lang.String str11 = user7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{ email='Non-Faculty Staff', password='Faculty', type='Non-Faculty Staff' }" + "'", str11.equals("{ email='Non-Faculty Staff', password='Faculty', type='Non-Faculty Staff' }"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingSpaceId();
        int int14 = booking12.getParkingSpaceId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        booking16.setParkingSpaceId(100);
        java.util.Date date21 = null;
        com.parkingbookingsystem.Booking booking22 = booking16.startTime(date21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking22);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand10 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "{ email='', password='hi!', type='Visitor'}", (int) (short) 0, (int) (byte) 1, (int) (short) 10, "Student", date8, date9);
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult11 = modifyParkingSpaceBookingCommand10.execute();
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult12 = modifyParkingSpaceBookingCommand10.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(voidResult11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(voidResult12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        boolean boolean1 = com.parkingbookingsystem.User.clientEmailValid("Non-Faculty Staff");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor8 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.sensor(sensor8);
        sensor8.setCarDetected(false);
        sensor8.setCarDetected(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = database0.delete("Non-Faculty Staff", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: src/main/java/data/DB_Non-Faculty Staff.csv (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        com.parkingbookingsystem.Visitor visitor4 = new com.parkingbookingsystem.Visitor("", "");
        java.lang.String[] strArray5 = visitor4.serialize();
        java.lang.String[] strArray6 = com.parkingbookingsystem.UserFactory.getAllClientTypes();
        com.parkingbookingsystem.Visitor visitor9 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray10 = visitor9.serialize();
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray5, strArray6, strArray10 };
        java.util.ArrayList<java.lang.String[]> strArrayList12 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList12, strArray11);
// flaky:         database0.writeAll("Faculty", (java.util.List<java.lang.String[]>) strArrayList12);
        database0.removeAllSubscribers();
        com.parkingbookingsystem.ParkingLot parkingLot19 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot19.setEnabled(false);
        parkingLot19.setEnabled(false);
        java.lang.String[] strArray24 = parkingLot19.serialize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = database0.update("{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", (int) '4', strArray24);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: src/main/java/data/DB_{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}.csv (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        com.parkingbookingsystem.ParkingSpace parkingSpace7 = parkingLot1.getParkingSpaceById((int) (byte) 100);
        boolean boolean8 = parkingLot1.isEnabled();
        java.lang.String str9 = parkingLot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{ parkingId='152', location='Student', enabled='false'}" + "'", str9.equals("{ parkingId='152', location='Student', enabled='false'}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.parkingbookingsystem.Controller controller0 = null;
        com.parkingbookingsystem.commands.GetBookingByIdCommand getBookingByIdCommand2 = new com.parkingbookingsystem.commands.GetBookingByIdCommand(controller0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult3 = getBookingByIdCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Controller.getBookingById(int)\" because \"this.receiver\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str0 = com.parkingbookingsystem.SuperManager.TYPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Super Manager" + "'", str0.equals("Super Manager"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor8 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.sensor(sensor8);
        java.lang.String str10 = parkingSpace9.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Location 35" + "'", str10.equals("Location 35"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.parkingbookingsystem.SuperManager superManager2 = com.parkingbookingsystem.SuperManager.getInstance("Visitor", "Visitor");
        superManager2.setPassword("{ email='', password='hi!', type='Visitor'}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("hi!", "");
        java.lang.String[] strArray3 = staff2.serialize();
        staff2.invalidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        com.parkingbookingsystem.Booking booking19 = booking17.userId("");
        java.util.Date date20 = null;
        com.parkingbookingsystem.Booking booking21 = booking19.endTime(date20);
        booking19.setRemainingAmount((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById(0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult17 = controller0.getAvailableParkingSpaceList();
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult19 = controller0.getBookingsForUser("Visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult19);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        java.util.Date date15 = null;
        booking12.setEndTime(date15);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str0 = com.parkingbookingsystem.Manager.TYPE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Manager" + "'", str0.equals("Manager"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String[] strArray0 = com.parkingbookingsystem.UserFactory.getAllClientTypes();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.Booking booking1 = com.parkingbookingsystem.Booking.deserialize(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Non-Faculty Staff\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.parkingbookingsystem.Student student2 = new com.parkingbookingsystem.Student("Student", "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand4 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "", 100, 10);
        controller0.cancelParkingSpaceBooking("Visitor", (int) (short) -1, (int) ' ');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult12 = controller0.getUserById("Faculty");
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        booking16.setParkingSpaceId(100);
        boolean boolean21 = booking16.isCheckedIn();
        booking16.setStatus("Super Manager");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(10, (int) (byte) 100);
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand18 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "Non-Faculty Staff", (int) (short) 1, 10, 0, "{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", date16, date17);
        controller0.disableParkingSpaceById((int) (short) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        booking17.setCheckedIn(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingLot1.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.getPaymentMethod();
        int int8 = payment5.getBookingId();
        java.lang.String str9 = payment5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}" + "'", str9.equals("{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(10, (int) (byte) 100);
        com.parkingbookingsystem.Controller controller11 = new com.parkingbookingsystem.Controller();
        controller11.enableParkingSpaceById(100, 1);
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        java.util.Date date23 = null;
        com.parkingbookingsystem.Booking booking27 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date21, date22, date23, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int28 = booking27.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand29 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller11, booking27);
        booking27.setUserId("Faculty");
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.ParkingLot.getParkingSpaceById(int)\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.parkingbookingsystem.Student student2 = new com.parkingbookingsystem.Student("Visitor", "");
        boolean boolean4 = student2.canLogin("Student");
        java.lang.Class<?> wildcardClass5 = student2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("Non-Faculty Staff", (int) (short) 0, (double) 100.0f, "Non-Faculty Staff", "Super Manager");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "");
        java.lang.String[] strArray3 = visitor2.serialize();
        com.parkingbookingsystem.Controller controller4 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand8 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller4, "", 100, 10);
        boolean boolean9 = visitor2.equals((java.lang.Object) cancelParkingSpaceBookingCommand8);
        visitor2.setType("{ parkingId='152', location='Student', enabled='false'}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 1);
        booking12.setStatus("");
        com.parkingbookingsystem.Booking booking18 = booking12.status("{ email='', password='hi!', type='Visitor'}");
        com.parkingbookingsystem.Booking booking20 = booking18.parkingLotId((int) (byte) 10);
        java.util.Date date21 = null;
        booking18.setStartTime(date21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking20);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date13 = null;
        booking12.setStartTime(date13);
        java.util.Date date15 = booking12.getCheckInTime();
        java.lang.String str16 = booking12.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{ email='', password='hi!', type='Visitor'}" + "'", str16.equals("{ email='', password='hi!', type='Visitor'}"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult14 = controller0.getBookingById((int) (short) 1);
        com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand getUnvalidatedClientsCommand15 = new com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand(controller0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        java.lang.String str8 = payment5.getStatus();
        com.parkingbookingsystem.Payment payment10 = payment5.paymentMethod("Visitor");
        payment10.setAmount((double) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor8 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.sensor(sensor8);
        sensor8.setCarDetected(false);
        int int12 = sensor8.getParkingSpaceId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(10, (int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult12 = controller0.getBookingsForUser("Student");
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        com.parkingbookingsystem.commands.BookParkingSpaceCommand bookParkingSpaceCommand19 = new com.parkingbookingsystem.commands.BookParkingSpaceCommand(controller0, "Student", 35, (int) (byte) 100, "hi!", date17, date18);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult20 = bookParkingSpaceCommand19.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Client.getRate()\" because the return value of \"com.parkingbookingsystem.commands.Result.getResult()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.Booking booking7 = new com.parkingbookingsystem.Booking("Super Manager", (int) (short) 0, (int) (byte) 1, (double) 100L, date4, date5, "Non-Faculty Staff");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray3 = visitor2.serialize();
        java.lang.String str4 = visitor2.toString();
        java.lang.String str5 = visitor2.getPassword();
        java.lang.String str6 = visitor2.getEmail();
        visitor2.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{ email='', password='hi!', type='Visitor' }" + "'", str4.equals("{ email='', password='hi!', type='Visitor' }"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        com.parkingbookingsystem.ParkingSpace parkingSpace7 = parkingLot1.getParkingSpaceById((int) (byte) 100);
        boolean boolean8 = parkingLot1.isEnabled();
        parkingLot1.setLocation("Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        booking12.setCheckedIn(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(10, (int) (byte) 100);
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand18 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "Non-Faculty Staff", (int) (short) 1, 10, 0, "{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", date16, date17);
        java.lang.Class<?> wildcardClass19 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand8 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand13 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult15 = controller0.getParkingLotById((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById(0);
        com.parkingbookingsystem.commands.CreateUserCommand createUserCommand20 = new com.parkingbookingsystem.commands.CreateUserCommand(controller0, "Faculty", "{ email='Non-Faculty Staff', password='Faculty', type='Non-Faculty Staff'}", "Location 35");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand4 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        controller0.disableParkingLotById((int) '4');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand getUnvalidatedClientsCommand4 = new com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand(controller0);
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand8 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, 1.0d, "Faculty", 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult10 = controller0.getBookingById(1);
        com.parkingbookingsystem.commands.CreateParkingLotCommand createParkingLotCommand12 = new com.parkingbookingsystem.commands.CreateParkingLotCommand(controller0, "{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.parkingbookingsystem.Manager manager2 = new com.parkingbookingsystem.Manager("Faculty", "Faculty");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("{ email='Non-Faculty Staff', password='Faculty', type='Non-Faculty Staff'}", "{ email='', password='hi!', type='Visitor'}");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = parkingLotResult16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setPaymentMethod("{ email='', password='hi!', type='Visitor'}");
        payment5.setPaymentMethod("Super Manager");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.parkingbookingsystem.Controller controller0 = null;
        com.parkingbookingsystem.commands.DeleteUserCommand deleteUserCommand2 = new com.parkingbookingsystem.commands.DeleteUserCommand(controller0, "");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult3 = deleteUserCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Controller.deleteUser(String)\" because \"this.receiver\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("{ email='', password='hi!', type='Visitor'}");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.parkingbookingsystem.Manager manager2 = new com.parkingbookingsystem.Manager("hi!", "{ email='Non-Faculty Staff', password='Faculty', type='Non-Faculty Staff'}");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        boolean boolean1 = com.parkingbookingsystem.User.passwordValid("{ email='Non-Faculty Staff', password='Faculty', type='Non-Faculty Staff'}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.parkingbookingsystem.Sensor sensor2 = new com.parkingbookingsystem.Sensor((int) (byte) 100, (int) '4');
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.parkingbookingsystem.Faculty faculty2 = new com.parkingbookingsystem.Faculty("Student", "{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(10, (int) (byte) 100);
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand18 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "Non-Faculty Staff", (int) (short) 1, 10, 0, "{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", date16, date17);
        controller0.enableParkingSpaceById((int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        boolean boolean1 = com.parkingbookingsystem.User.clientEmailValid("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        com.parkingbookingsystem.Booking booking20 = booking16.licensePlate("Non-Faculty Staff");
        booking16.setLicensePlate("{ email='', password='hi!', type='Visitor'}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking20);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor8 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.sensor(sensor8);
        com.parkingbookingsystem.Sensor sensor10 = parkingSpace9.getSensor();
        sensor10.setCarDetected(false);
        java.lang.String str13 = sensor10.scanCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        com.parkingbookingsystem.Controller controller19 = new com.parkingbookingsystem.Controller();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        com.parkingbookingsystem.Booking booking32 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date26, date27, date28, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date33 = null;
        booking32.setStartTime(date33);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand35 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller19, booking32);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand36 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking32);
        com.parkingbookingsystem.Booking booking38 = booking32.status("Visitor");
        booking38.setUserId("{ parkingId='152', location='Student', enabled='false'}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking38);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        com.parkingbookingsystem.Payment payment9 = payment5.amount((double) '#');
        java.lang.String[] strArray10 = payment5.serialize();
        com.parkingbookingsystem.ParkingLot parkingLot11 = com.parkingbookingsystem.ParkingLot.deserialize(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str6 = payment5.getUserId();
        payment5.setAmount((double) 0L);
        java.lang.String str9 = payment5.getStatus();
        int int10 = payment5.getBookingId();
        payment5.setPaymentMethod("Super Manager");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.parkingbookingsystem.CreditCardStrategy creditCardStrategy0 = new com.parkingbookingsystem.CreditCardStrategy();
        com.parkingbookingsystem.DebitCardStrategy debitCardStrategy1 = new com.parkingbookingsystem.DebitCardStrategy();
        com.parkingbookingsystem.Payment payment7 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str8 = payment7.getUserId();
        boolean boolean9 = debitCardStrategy1.processPayment(payment7);
        payment7.setPaymentMethod("Student");
        boolean boolean12 = creditCardStrategy0.processPayment(payment7);
        com.parkingbookingsystem.Payment payment18 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment18.setAmount((double) 1);
        java.lang.String str21 = payment18.getStatus();
        java.lang.String str22 = payment18.toString();
        java.lang.String str23 = payment18.getStatus();
        boolean boolean24 = creditCardStrategy0.processPayment(payment18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{ paymentId='145', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}" + "'", str22.equals("{ paymentId='145', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("hi!", "");
        double double3 = staff2.getRate();
        java.lang.String[] strArray4 = staff2.serialize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        com.parkingbookingsystem.Booking booking19 = booking17.userId("");
        java.util.Date date20 = null;
        com.parkingbookingsystem.Booking booking21 = booking19.endTime(date20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = booking19.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"this.checkInTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking21);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        payment5.setStatus("Visitor");
        java.lang.String str10 = payment5.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand13 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        com.parkingbookingsystem.commands.ValidateUserCommand validateUserCommand15 = new com.parkingbookingsystem.commands.ValidateUserCommand(controller0, "{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult16 = validateUserCommand15.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(voidResult16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(10, (int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult12 = controller0.getBookingsForUser("Student");
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        com.parkingbookingsystem.commands.BookParkingSpaceCommand bookParkingSpaceCommand19 = new com.parkingbookingsystem.commands.BookParkingSpaceCommand(controller0, "Student", 35, (int) (byte) 100, "hi!", date17, date18);
        com.parkingbookingsystem.commands.ValidateUserCommand validateUserCommand21 = new com.parkingbookingsystem.commands.ValidateUserCommand(controller0, "{ email='', password='hi!', type='Visitor'}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        controller0.cancelParkingSpaceBooking("Non-Faculty Staff", (int) '4', 138);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult18 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult20 = controller0.getParkingLotById((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult20);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById(0);
        controller0.enableParkingSpaceById((int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        userResult2.setMessage("{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date13 = null;
        booking12.setStartTime(date13);
        java.util.Date date15 = booking12.getEndTime();
        com.parkingbookingsystem.Booking booking17 = booking12.licensePlate("Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Non-Faculty Staff");
        parkingLot1.disable();
        com.parkingbookingsystem.ParkingLot parkingLot4 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot4.setEnabled(false);
        parkingLot4.setEnabled(false);
        java.lang.String[] strArray9 = parkingLot4.serialize();
        parkingLot4.enable();
        boolean boolean11 = parkingLot1.equals((java.lang.Object) parkingLot4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand2 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (int) '4');
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand6 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, (double) (-1L), "Non-Faculty Staff", (int) (byte) 1);
        controller0.disableParkingSpaceById((int) '#', (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.parkingbookingsystem.Controller controller0 = null;
        com.parkingbookingsystem.commands.GetBookingsForUserCommand getBookingsForUserCommand2 = new com.parkingbookingsystem.commands.GetBookingsForUserCommand(controller0, "");
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult3 = getBookingsForUserCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Controller.getBookingsForUser(String)\" because \"this.receiver\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 1);
        booking12.setRemainingAmount((double) (byte) 100);
        boolean boolean17 = booking12.isCheckedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("Super Manager", "Sensor ID: 0, Parking Space ID: 10, Car Detected: false");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        com.parkingbookingsystem.Booking booking19 = booking17.userId("");
        java.util.Date date20 = null;
        com.parkingbookingsystem.Booking booking21 = booking19.endTime(date20);
        booking21.setDepositAmount(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking21);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        booking12.setParkingLotId((int) (byte) 0);
        int int18 = booking12.getParkingSpaceId();
        com.parkingbookingsystem.Booking booking20 = booking12.remainingAmount(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking20);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        booking12.setParkingLotId((int) (byte) 0);
        int int18 = booking12.getParkingSpaceId();
        int int19 = booking12.getBookingId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand10 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "{ email='', password='hi!', type='Visitor'}", (int) (short) 0, (int) (byte) 1, (int) (short) 10, "Student", date8, date9);
        com.parkingbookingsystem.commands.CreateParkingLotCommand createParkingLotCommand12 = new com.parkingbookingsystem.commands.CreateParkingLotCommand(controller0, "");
// flaky:         controller0.createParkingLot("{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
        controller0.cancelParkingSpaceBooking("{ email='Non-Faculty Staff', password='Faculty', type='Non-Faculty Staff'}", 0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingLotId();
        double double14 = booking12.getDepositAmount();
        java.util.Date date15 = null;
        com.parkingbookingsystem.Booking booking16 = booking12.endTime(date15);
        java.util.Date date17 = null;
        booking12.setEndTime(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("{ parkingId='152', location='Student', enabled='false'}", 0, (double) 1.0f, "Visitor", "{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        com.parkingbookingsystem.commands.ValidateUserCommand validateUserCommand5 = new com.parkingbookingsystem.commands.ValidateUserCommand(controller0, "{ parkingId='152', location='Student', enabled='false'}");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult7 = controller0.getBookingsForUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingLotId();
        com.parkingbookingsystem.Booking booking15 = booking12.parkingSpaceId((int) (byte) 10);
        java.util.Date date16 = null;
        com.parkingbookingsystem.Booking booking17 = booking12.startTime(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        database0.notifySubscribers("hi!");
        database0.removeAllSubscribers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.parkingbookingsystem.CreditCardStrategy creditCardStrategy0 = new com.parkingbookingsystem.CreditCardStrategy();
        com.parkingbookingsystem.DebitCardStrategy debitCardStrategy1 = new com.parkingbookingsystem.DebitCardStrategy();
        com.parkingbookingsystem.Payment payment7 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str8 = payment7.getUserId();
        boolean boolean9 = debitCardStrategy1.processPayment(payment7);
        payment7.setPaymentMethod("Student");
        boolean boolean12 = creditCardStrategy0.processPayment(payment7);
        boolean boolean14 = payment7.equals((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray3 = visitor2.serialize();
        java.lang.String[] strArray4 = visitor2.serialize();
        visitor2.invalidate();
        visitor2.invalidate();
        java.lang.String str7 = visitor2.getType();
        visitor2.invalidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Visitor" + "'", str7.equals("Visitor"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand4 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "", 100, 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult5 = null; // flaky: controller0.generateManager();
        controller0.cancelParkingSpaceBooking("", (int) '4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        database0.notifySubscribers("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String[]> strArrayList4 = database0.readAll("Sensor ID: 0, Parking Space ID: 10, Car Detected: false");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: src/main/java/data/DB_Sensor ID: 0, Parking Space ID: 10, Car Detected: false.csv (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str6 = payment5.getUserId();
        payment5.setAmount((double) 0L);
        java.lang.String str9 = payment5.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        com.parkingbookingsystem.Booking booking19 = booking17.userId("");
        java.util.Date date20 = null;
        com.parkingbookingsystem.Booking booking21 = booking19.endTime(date20);
        java.util.Date date22 = null;
        booking21.setEndTime(date22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking21);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand4 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "", 100, 10);
        controller0.cancelParkingSpaceBooking("Visitor", (int) (short) -1, (int) ' ');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult12 = controller0.getBookingsForUser("Student");
        com.parkingbookingsystem.commands.GetUserCommand getUserCommand14 = new com.parkingbookingsystem.commands.GetUserCommand(controller0, "Non-Faculty Staff");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        com.parkingbookingsystem.Payment payment9 = payment5.amount((double) '#');
        java.lang.String str10 = payment5.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date13 = null;
        booking12.setStartTime(date13);
        java.util.Date date15 = booking12.getCheckInTime();
        java.lang.Class<?> wildcardClass16 = booking12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingLotId();
        double double14 = booking12.getDepositAmount();
        java.util.Date date15 = null;
        com.parkingbookingsystem.Booking booking16 = booking12.endTime(date15);
        int int17 = booking12.getParkingSpaceId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult14 = controller0.getBookingById((int) (short) 1);
        com.parkingbookingsystem.commands.CreateParkingLotCommand createParkingLotCommand16 = new com.parkingbookingsystem.commands.CreateParkingLotCommand(controller0, "Student");
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand18 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand2 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (int) '4');
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand6 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, (double) (-1L), "Non-Faculty Staff", (int) (byte) 1);
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand10 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "{ parkingId='152', location='Student', enabled='false'}", (int) (short) 0, (int) (short) 100);
        com.parkingbookingsystem.commands.GetUserCommand getUserCommand12 = new com.parkingbookingsystem.commands.GetUserCommand(controller0, "{ paymentId='129', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult13 = getUserCommand12.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingLotId();
        int int14 = booking12.getParkingLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand getUnvalidatedClientsCommand4 = new com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand(controller0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult5 = getUnvalidatedClientsCommand4.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        database0.notifySubscribers("Non-Faculty Staff");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String[]> strArrayList4 = database0.readAll("{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: src/main/java/data/DB_{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}.csv (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        int int6 = parkingLot1.getParkingLotId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 185 + "'", int6 == 185);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingLotId();
        com.parkingbookingsystem.Booking booking15 = booking12.parkingSpaceId((int) (byte) 10);
        booking15.setUserId("Sensor ID: 0, Parking Space ID: 10, Car Detected: false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingLotId();
        com.parkingbookingsystem.Booking booking15 = booking12.parkingSpaceId((int) (byte) 10);
        boolean boolean16 = booking15.isCheckedIn();
        com.parkingbookingsystem.Booking booking18 = booking15.status("{ paymentId='145', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        java.util.Date date19 = null;
        booking15.setCheckInTime(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "");
        java.lang.String[] strArray3 = visitor2.serialize();
        java.lang.String[] strArray4 = visitor2.serialize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand4 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "", 100, 10);
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult5 = cancelParkingSpaceBookingCommand4.execute();
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult6 = cancelParkingSpaceBookingCommand4.execute();
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult7 = cancelParkingSpaceBookingCommand4.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(voidResult5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(voidResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(voidResult7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        com.parkingbookingsystem.Visitor visitor4 = new com.parkingbookingsystem.Visitor("", "");
        java.lang.String[] strArray5 = visitor4.serialize();
        java.lang.String[] strArray6 = com.parkingbookingsystem.UserFactory.getAllClientTypes();
        com.parkingbookingsystem.Visitor visitor9 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray10 = visitor9.serialize();
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray5, strArray6, strArray10 };
        java.util.ArrayList<java.lang.String[]> strArrayList12 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList12, strArray11);
// flaky:         database0.writeAll("Faculty", (java.util.List<java.lang.String[]>) strArrayList12);
        database0.removeAllSubscribers();
        com.parkingbookingsystem.Staff staff20 = new com.parkingbookingsystem.Staff("hi!", "");
        java.lang.String[] strArray21 = staff20.serialize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = database0.update("Location 35", (-1), strArray21);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: src/main/java/data/DB_Location 35.csv (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand20 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "{ email='', password='hi!', type='Visitor'}", (int) 'a', (int) '4', (int) (byte) 0, "{ email='', password='hi!', type='Visitor'}", date18, date19);
        controller0.validateUser("Faculty");
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult23 = controller0.getUnvalidatedClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult23);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 1);
        booking12.setStatus("");
        double double17 = booking12.getDepositAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        com.parkingbookingsystem.Booking booking19 = booking17.depositAmount((double) 100.0f);
        com.parkingbookingsystem.Booking booking21 = booking17.licensePlate("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking21);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus6 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE;
        parkingSpace3.setStatus(parkingStatus6);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus8 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.RESERVED;
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.status(parkingStatus8);
        parkingSpace9.setLocation("{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
        int int12 = parkingSpace9.getParkingSpaceId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + parkingStatus6 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE + "'", parkingStatus6.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingStatus8 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.RESERVED + "'", parkingStatus8.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.RESERVED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("Faculty", "{ email='', password='hi!', type='Visitor'}");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("{ email='', password='hi!', type='Visitor'}", "Faculty");
        double double3 = staff2.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("{ paymentId='129', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        parkingLot1.disable();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.parkingbookingsystem.DebitCardStrategy debitCardStrategy0 = new com.parkingbookingsystem.DebitCardStrategy();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str7 = payment6.getUserId();
        boolean boolean8 = debitCardStrategy0.processPayment(payment6);
        int int9 = payment6.getPaymentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 152 + "'", int9 == 152);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        java.lang.String str8 = payment5.getStatus();
        com.parkingbookingsystem.Payment payment10 = payment5.paymentMethod("Visitor");
        com.parkingbookingsystem.Payment payment12 = payment10.amount((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray3 = visitor2.serialize();
        com.parkingbookingsystem.User user4 = com.parkingbookingsystem.UserFactory.createUser(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.parkingbookingsystem.Controller controller0 = null;
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand1 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult2 = getAvailableParkingSpaceListCommand1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Controller.getAvailableParkingSpaceList()\" because \"this.receiver\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingLotId();
        double double14 = booking12.getDepositAmount();
        booking12.setStatus("Sensor ID: 0, Parking Space ID: 10, Car Detected: false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray3 = visitor2.serialize();
        java.lang.String str4 = visitor2.toString();
        java.lang.String str5 = visitor2.getPassword();
        visitor2.setEmail("Student");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{ email='', password='hi!', type='Visitor' }" + "'", str4.equals("{ email='', password='hi!', type='Visitor' }"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray3 = visitor2.serialize();
        java.lang.String str4 = visitor2.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Visitor" + "'", str4.equals("Visitor"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        com.parkingbookingsystem.Subscriber subscriber1 = null;
        database0.removeSubscriber(subscriber1);
        com.parkingbookingsystem.Subscriber subscriber3 = null;
        database0.removeSubscriber(subscriber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        com.parkingbookingsystem.User user3 = userResult2.getResult();
        com.parkingbookingsystem.User user7 = new com.parkingbookingsystem.User("Non-Faculty Staff", "", "Non-Faculty Staff");
        user7.setPassword("Faculty");
        userResult2.setResult(user7);
        com.parkingbookingsystem.Staff staff13 = new com.parkingbookingsystem.Staff("hi!", "");
        double double14 = staff13.getRate();
        userResult2.setResult((com.parkingbookingsystem.User) staff13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        double double15 = booking12.getDepositAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        boolean boolean1 = com.parkingbookingsystem.User.passwordValid("Manager");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingSpaceId();
        double double14 = booking12.getDepositAmount();
        java.lang.String str15 = booking12.getUserId();
        com.parkingbookingsystem.Booking booking17 = booking12.status("Non-Faculty Staff");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        int int15 = booking12.getParkingSpaceId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand20 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "{ email='', password='hi!', type='Visitor'}", (int) 'a', (int) '4', (int) (byte) 0, "{ email='', password='hi!', type='Visitor'}", date18, date19);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult22 = controller0.getParkingLotById((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult22);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        com.parkingbookingsystem.Sensor sensor4 = parkingSpace3.getSensor();
        java.lang.String str5 = parkingSpace3.getLocation();
        com.parkingbookingsystem.Sensor sensor6 = parkingSpace3.getSensor();
        java.lang.String str7 = sensor6.scanCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Location 35" + "'", str5.equals("Location 35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingSpaceId();
        com.parkingbookingsystem.Booking booking15 = booking12.licensePlate("");
        com.parkingbookingsystem.Booking booking17 = booking15.userId("{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingLot>> parkingLotListResult13 = controller0.getParkingLotList();
        com.parkingbookingsystem.commands.GenerateManagerCommand generateManagerCommand14 = new com.parkingbookingsystem.commands.GenerateManagerCommand(controller0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = generateManagerCommand14.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotListResult13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand4 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "", 100, 10);
        controller0.cancelParkingSpaceBooking("Visitor", (int) (short) -1, (int) ' ');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult12 = controller0.getBookingsForUser("Student");
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand13 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult14 = getAvailableParkingSpaceListCommand13.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        com.parkingbookingsystem.Booking booking19 = booking17.userId("");
        com.parkingbookingsystem.Booking booking21 = booking19.licensePlate("{ paymentId='129', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        java.util.Date date22 = null;
        booking21.setStartTime(date22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Non-Faculty Staff");
        java.lang.String[] strArray2 = parkingLot1.serialize();
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.ParkingSpace parkingSpace3 = com.parkingbookingsystem.ParkingSpace.deserialize(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant com.parkingbookingsystem.ParkingSpace.ParkingStatus.Non-Faculty Staff");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand16 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "Visitor", (int) '#', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        com.parkingbookingsystem.Booking booking20 = booking16.licensePlate("Non-Faculty Staff");
        com.parkingbookingsystem.Booking booking22 = booking16.parkingLotId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking22);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        java.lang.String str8 = payment5.getStatus();
        com.parkingbookingsystem.Payment payment10 = payment5.paymentMethod("Visitor");
        java.lang.String str11 = payment5.getStatus();
        int int12 = payment5.getPaymentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.parkingbookingsystem.Controller controller0 = null;
        com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand getUnvalidatedClientsCommand1 = new com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand(controller0);
        // The following exception was thrown during execution in test generation
        try {
            com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult2 = getUnvalidatedClientsCommand1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Controller.getUnvalidatedClients()\" because \"this.receiver\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.parkingbookingsystem.Student student2 = new com.parkingbookingsystem.Student("Super Manager", "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        com.parkingbookingsystem.ParkingSpace parkingSpace5 = parkingLot1.getParkingSpaceById(0);
        java.util.List<com.parkingbookingsystem.ParkingSpace> parkingSpaceList6 = parkingLot1.getAvailableParkingSpaceList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date13 = null;
        booking12.setStartTime(date13);
        java.util.Date date15 = booking12.getCheckInTime();
        com.parkingbookingsystem.Booking booking17 = booking12.licensePlate("Manager");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.parkingbookingsystem.CreditCardStrategy creditCardStrategy0 = new com.parkingbookingsystem.CreditCardStrategy();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str7 = payment6.getUserId();
        payment6.setAmount((double) 0L);
        java.lang.String str10 = payment6.getStatus();
        int int11 = payment6.getBookingId();
        boolean boolean12 = creditCardStrategy0.processPayment(payment6);
        com.parkingbookingsystem.DebitCardStrategy debitCardStrategy13 = new com.parkingbookingsystem.DebitCardStrategy();
        com.parkingbookingsystem.Payment payment19 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str20 = payment19.getUserId();
        boolean boolean21 = debitCardStrategy13.processPayment(payment19);
        payment19.setPaymentMethod("Student");
        int int24 = payment19.getPaymentId();
        boolean boolean25 = creditCardStrategy0.processPayment(payment19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 157 + "'", int24 == 157);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        com.parkingbookingsystem.Booking booking20 = booking16.licensePlate("Non-Faculty Staff");
        java.lang.String str21 = booking16.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray3 = visitor2.serialize();
        java.lang.String[] strArray4 = visitor2.serialize();
        visitor2.invalidate();
        visitor2.invalidate();
        java.lang.String[] strArray7 = visitor2.serialize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        boolean boolean6 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.GetBookingsForUserCommand getBookingsForUserCommand8 = new com.parkingbookingsystem.commands.GetBookingsForUserCommand(controller0, "hi!");
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand12 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, (double) (byte) 0, "{ paymentId='129', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", (int) (short) 10);
        controller0.cancelParkingSpaceBooking("{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}", (int) 'a', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        boolean boolean1 = com.parkingbookingsystem.User.passwordValid("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("{ email='', password='hi!', type='Visitor'}", "Faculty");
        staff2.setPassword("Faculty");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        com.parkingbookingsystem.ParkingSpace parkingSpace7 = parkingLot1.getParkingSpaceById((int) (byte) 100);
        parkingSpace7.enable();
        parkingSpace7.setLocation("Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", "hi!");
        java.lang.String str3 = staff2.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Non-Faculty Staff" + "'", str3.equals("Non-Faculty Staff"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        com.parkingbookingsystem.ParkingSpace parkingSpace7 = parkingLot1.getParkingSpaceById((int) (byte) 100);
        parkingSpace7.enable();
        parkingSpace7.disable();
        parkingSpace7.setParkingSpaceId((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.Controller controller8 = new com.parkingbookingsystem.Controller();
        controller8.enableParkingSpaceById(100, 1);
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        com.parkingbookingsystem.Booking booking24 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date18, date19, date20, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int25 = booking24.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand26 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller8, booking24);
        com.parkingbookingsystem.Booking booking28 = booking24.licensePlate("Non-Faculty Staff");
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand29 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking24);
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        java.util.Date date38 = null;
        com.parkingbookingsystem.Booking booking42 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date36, date37, date38, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking42.setParkingLotId((int) (short) 0);
        boolean boolean45 = booking42.isCheckedIn();
        com.parkingbookingsystem.Booking booking47 = booking42.depositAmount((double) (byte) 1);
        com.parkingbookingsystem.Booking booking49 = booking47.userId("");
        com.parkingbookingsystem.Booking booking51 = booking49.licensePlate("{ paymentId='129', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand52 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking51);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor8 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.sensor(sensor8);
        int int10 = sensor8.getSensorId();
        java.lang.String str11 = sensor8.scanCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.parkingbookingsystem.commands.Result<java.util.SequencedCollection<com.parkingbookingsystem.ParkingSpace>> parkingSpaceCollectionResult0 = new com.parkingbookingsystem.commands.Result<java.util.SequencedCollection<com.parkingbookingsystem.ParkingSpace>>();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        com.parkingbookingsystem.Sensor sensor4 = parkingSpace3.getSensor();
        java.lang.String str5 = parkingSpace3.getLocation();
        com.parkingbookingsystem.Sensor sensor6 = parkingSpace3.getSensor();
        sensor6.setCarDetected(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Location 35" + "'", str5.equals("Location 35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        com.parkingbookingsystem.ParkingSpace parkingSpace7 = parkingLot1.getParkingSpaceById((int) (byte) 100);
        parkingSpace7.enable();
        parkingSpace7.disable();
        java.lang.String str10 = parkingSpace7.toString();
        parkingSpace7.setLocation("{ paymentId='145', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById(0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.ParkingSpace>> parkingSpaceListResult17 = controller0.getAvailableParkingSpaceList();
        // The following exception was thrown during execution in test generation
        try {
            controller0.addPayment((double) (short) 100, "Visitor", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.Booking.getUserId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceListResult17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.parkingbookingsystem.Student student2 = new com.parkingbookingsystem.Student("", "Student");
        double double3 = student2.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand8 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (int) (short) 10);
        com.parkingbookingsystem.commands.CreateUserCommand createUserCommand12 = new com.parkingbookingsystem.commands.CreateUserCommand(controller0, "", "{ parkingId='152', location='Student', enabled='false'}", "Manager");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Non-Faculty Staff");
        parkingLot1.disable();
        parkingLot1.setEnabled(false);
        boolean boolean5 = parkingLot1.isEnabled();
        com.parkingbookingsystem.ParkingLot parkingLot7 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpaceById(35);
        parkingSpace9.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor14 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace15 = parkingSpace9.sensor(sensor14);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus16 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE;
        parkingSpace15.setStatus(parkingStatus16);
        com.parkingbookingsystem.ParkingLot parkingLot19 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpaceById(35);
        parkingSpace21.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor26 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace27 = parkingSpace21.sensor(sensor26);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus28 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE;
        parkingSpace27.setStatus(parkingStatus28);
        parkingSpace15.setStatus(parkingStatus28);
        parkingSpace15.setParkingSpaceId(0);
        com.parkingbookingsystem.ParkingLot parkingLot34 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace36 = parkingLot34.getParkingSpaceById(35);
        parkingSpace36.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.ParkingLot parkingLot40 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace42 = parkingLot40.getParkingSpaceById(35);
        parkingSpace42.setParkingSpaceId((int) (byte) 0);
        java.lang.String str45 = parkingSpace42.toString();
        com.parkingbookingsystem.ParkingLot parkingLot47 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace49 = parkingLot47.getParkingSpaceById(35);
        com.parkingbookingsystem.Sensor sensor50 = parkingSpace49.getSensor();
        java.lang.String str51 = parkingSpace49.getLocation();
        com.parkingbookingsystem.ParkingLot parkingLot53 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace55 = parkingLot53.getParkingSpaceById(35);
        parkingSpace55.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor60 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace61 = parkingSpace55.sensor(sensor60);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus62 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE;
        parkingSpace61.setStatus(parkingStatus62);
        com.parkingbookingsystem.ParkingLot parkingLot65 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace67 = parkingLot65.getParkingSpaceById(35);
        parkingSpace67.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor72 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace73 = parkingSpace67.sensor(sensor72);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus74 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE;
        parkingSpace73.setStatus(parkingStatus74);
        parkingSpace61.setStatus(parkingStatus74);
        parkingSpace61.setParkingSpaceId(0);
        parkingSpace61.setParkingLotId((int) '4');
        com.parkingbookingsystem.ParkingLot parkingLot82 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace84 = parkingLot82.getParkingSpaceById(35);
        parkingSpace84.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus87 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE;
        parkingSpace84.setStatus(parkingStatus87);
        com.parkingbookingsystem.ParkingSpace[] parkingSpaceArray89 = new com.parkingbookingsystem.ParkingSpace[] { parkingSpace15, parkingSpace36, parkingSpace42, parkingSpace49, parkingSpace61, parkingSpace84 };
        parkingLot1.setSpaces(parkingSpaceArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertTrue("'" + parkingStatus16 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE + "'", parkingStatus16.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace27);
        org.junit.Assert.assertTrue("'" + parkingStatus28 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE + "'", parkingStatus28.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Location 35" + "'", str51.equals("Location 35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace61);
        org.junit.Assert.assertTrue("'" + parkingStatus62 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE + "'", parkingStatus62.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace73);
        org.junit.Assert.assertTrue("'" + parkingStatus74 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE + "'", parkingStatus74.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace84);
        org.junit.Assert.assertTrue("'" + parkingStatus87 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE + "'", parkingStatus87.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray89);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 1);
        booking12.setRemainingAmount((double) (byte) 100);
        java.util.Date date17 = null;
        com.parkingbookingsystem.Booking booking18 = booking12.endTime(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking18);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(10, (int) (byte) 100);
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand modifyParkingSpaceBookingCommand18 = new com.parkingbookingsystem.commands.ModifyParkingSpaceBookingCommand(controller0, "Non-Faculty Staff", (int) (short) 1, 10, 0, "{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", date16, date17);
// flaky:         controller0.createParkingLot("Faculty");
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        com.parkingbookingsystem.Booking booking33 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date27, date28, date29, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking33.setParkingLotId((int) (short) 1);
        booking33.setStatus("");
        com.parkingbookingsystem.Booking booking39 = booking33.status("{ email='', password='hi!', type='Visitor'}");
        com.parkingbookingsystem.Booking booking41 = booking39.parkingLotId((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.ParkingLot.getParkingSpaceById(int)\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking41);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        com.parkingbookingsystem.Controller controller19 = new com.parkingbookingsystem.Controller();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        com.parkingbookingsystem.Booking booking32 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date26, date27, date28, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        java.util.Date date33 = null;
        booking32.setStartTime(date33);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand35 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller19, booking32);
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand36 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking32);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult37 = null; // flaky: controller0.generateManager();
        com.parkingbookingsystem.User user38 = null; // flaky: userResult37.getResult();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userResult37);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(user38);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand2 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (int) '4');
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand6 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, (double) (-1L), "Non-Faculty Staff", (int) (byte) 1);
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand10 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "{ parkingId='152', location='Student', enabled='false'}", (int) (short) 0, (int) (short) 100);
        com.parkingbookingsystem.commands.GetUserCommand getUserCommand12 = new com.parkingbookingsystem.commands.GetUserCommand(controller0, "{ paymentId='129', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        com.parkingbookingsystem.Booking booking25 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date19, date20, date21, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking25.setParkingLotId((int) (short) 0);
        boolean boolean28 = booking25.isCheckedIn();
        // The following exception was thrown during execution in test generation
        try {
            controller0.checkIntoBooking(booking25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.parkingbookingsystem.ParkingLot.getParkingSpaceById(int)\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand13 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        com.parkingbookingsystem.commands.ValidateUserCommand validateUserCommand15 = new com.parkingbookingsystem.commands.ValidateUserCommand(controller0, "{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
        java.util.Date date22 = null;
        java.util.Date date23 = null;
        java.util.Date date24 = null;
        com.parkingbookingsystem.Booking booking28 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date22, date23, date24, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int29 = booking28.getParkingLotId();
        double double30 = booking28.getDepositAmount();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand31 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking28);
        double double32 = booking28.getDepositAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingSpaceId();
        com.parkingbookingsystem.Booking booking15 = booking12.licensePlate("");
        booking15.setParkingLotId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        parkingLot1.setEnabled(false);
        parkingLot1.setEnabled(false);
        com.parkingbookingsystem.ParkingSpace parkingSpace7 = parkingLot1.getParkingSpaceById((int) (byte) 100);
        parkingSpace7.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "");
        java.lang.String[] strArray3 = visitor2.serialize();
        visitor2.setEmail("{ paymentId='145', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        java.lang.String str8 = payment5.getStatus();
        java.lang.String str9 = payment5.toString();
        double double10 = payment5.getAmount();
        com.parkingbookingsystem.Payment payment12 = payment5.status("{ paymentId='129', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{ paymentId='158', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}" + "'", str9.equals("{ paymentId='158', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment12);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        controller0.enableParkingSpaceById(10, (int) (byte) 100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult12 = controller0.getBookingsForUser("Student");
        com.parkingbookingsystem.commands.GenerateManagerCommand generateManagerCommand13 = new com.parkingbookingsystem.commands.GenerateManagerCommand(controller0);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult14 = generateManagerCommand13.execute();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult15 = generateManagerCommand13.execute();
        com.parkingbookingsystem.Visitor visitor18 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String str19 = visitor18.getType();
        userResult15.setResult((com.parkingbookingsystem.User) visitor18);
        visitor18.setEmail("{ paymentId='158', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Visitor" + "'", str19.equals("Visitor"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        int int18 = booking17.getParkingLotId();
        booking17.setParkingSpaceId((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult14 = controller0.getBookingById((int) (short) 1);
        com.parkingbookingsystem.commands.CreateParkingLotCommand createParkingLotCommand16 = new com.parkingbookingsystem.commands.CreateParkingLotCommand(controller0, "Student");
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult17 = createParkingLotCommand16.execute();
        com.parkingbookingsystem.commands.Result<java.lang.Void> voidResult18 = createParkingLotCommand16.execute();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNull(voidResult17);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNull(voidResult18);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        boolean boolean4 = visitor2.canLogin("Student");
        java.lang.String[] strArray5 = visitor2.serialize();
        boolean boolean6 = visitor2.isValidated();
        double double7 = visitor2.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        com.parkingbookingsystem.Visitor visitor4 = new com.parkingbookingsystem.Visitor("", "");
        java.lang.String[] strArray5 = visitor4.serialize();
        java.lang.String[] strArray6 = com.parkingbookingsystem.UserFactory.getAllClientTypes();
        com.parkingbookingsystem.Visitor visitor9 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray10 = visitor9.serialize();
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray5, strArray6, strArray10 };
        java.util.ArrayList<java.lang.String[]> strArrayList12 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList12, strArray11);
// flaky:         database0.writeAll("Faculty", (java.util.List<java.lang.String[]>) strArrayList12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String[]> strArrayList16 = database0.readAll("{ paymentId='145', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: src/main/java/data/DB_{ paymentId='145', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}.csv (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", (int) (short) -1, (double) ' ', "", "Faculty");
        payment5.setPaymentMethod("Location 35");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.parkingbookingsystem.Visitor visitor2 = new com.parkingbookingsystem.Visitor("", "hi!");
        boolean boolean4 = visitor2.canLogin("Student");
        java.lang.String[] strArray5 = visitor2.serialize();
        java.lang.String str6 = visitor2.getEmail();
        java.lang.String str7 = visitor2.toString();
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{ email='', password='hi!', type='Visitor' }" + "'", str7.equals("{ email='', password='hi!', type='Visitor' }"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Visitor" + "'", str8.equals("Visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{ email='', password='hi!', type='Visitor' }" + "'", str9.equals("{ email='', password='hi!', type='Visitor' }"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.parkingbookingsystem.Student student2 = new com.parkingbookingsystem.Student("{ paymentId='154', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}", "{ parkingId='152', location='Student', enabled='false'}");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand14 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (-1));
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult16 = controller0.getParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand17 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        com.parkingbookingsystem.commands.ValidateUserCommand validateUserCommand19 = new com.parkingbookingsystem.commands.ValidateUserCommand(controller0, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult16);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.parkingbookingsystem.DebitCardStrategy debitCardStrategy0 = new com.parkingbookingsystem.DebitCardStrategy();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str7 = payment6.getUserId();
        boolean boolean8 = debitCardStrategy0.processPayment(payment6);
        com.parkingbookingsystem.DebitCardStrategy debitCardStrategy9 = new com.parkingbookingsystem.DebitCardStrategy();
        com.parkingbookingsystem.Payment payment15 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str16 = payment15.getUserId();
        boolean boolean17 = debitCardStrategy9.processPayment(payment15);
        boolean boolean19 = payment15.equals((java.lang.Object) (short) -1);
        com.parkingbookingsystem.Payment payment21 = payment15.paymentMethod("hi!");
        boolean boolean22 = debitCardStrategy0.processPayment(payment21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        com.parkingbookingsystem.Visitor visitor4 = new com.parkingbookingsystem.Visitor("", "");
        java.lang.String[] strArray5 = visitor4.serialize();
        java.lang.String[] strArray6 = com.parkingbookingsystem.UserFactory.getAllClientTypes();
        com.parkingbookingsystem.Visitor visitor9 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray10 = visitor9.serialize();
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray5, strArray6, strArray10 };
        java.util.ArrayList<java.lang.String[]> strArrayList12 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList12, strArray11);
// flaky:         database0.writeAll("Faculty", (java.util.List<java.lang.String[]>) strArrayList12);
        com.parkingbookingsystem.Subscriber subscriber15 = null;
        database0.removeSubscriber(subscriber15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult6 = controller0.getParkingLotById((int) 'a');
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult7 = controller0.getUnvalidatedClients();
        com.parkingbookingsystem.Controller controller8 = new com.parkingbookingsystem.Controller();
        controller8.enableParkingSpaceById(100, 1);
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        com.parkingbookingsystem.Booking booking24 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date18, date19, date20, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int25 = booking24.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand26 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller8, booking24);
        com.parkingbookingsystem.Booking booking28 = booking24.licensePlate("Non-Faculty Staff");
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand29 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking24);
        com.parkingbookingsystem.commands.DeleteUserCommand deleteUserCommand31 = new com.parkingbookingsystem.commands.DeleteUserCommand(controller0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking28);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.parkingbookingsystem.Database database0 = com.parkingbookingsystem.Database.getInstance();
        com.parkingbookingsystem.Visitor visitor4 = new com.parkingbookingsystem.Visitor("", "");
        java.lang.String[] strArray5 = visitor4.serialize();
        java.lang.String[] strArray6 = com.parkingbookingsystem.UserFactory.getAllClientTypes();
        com.parkingbookingsystem.Visitor visitor9 = new com.parkingbookingsystem.Visitor("", "hi!");
        java.lang.String[] strArray10 = visitor9.serialize();
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray5, strArray6, strArray10 };
        java.util.ArrayList<java.lang.String[]> strArrayList12 = new java.util.ArrayList<java.lang.String[]>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String[]>) strArrayList12, strArray11);
// flaky:         database0.writeAll("Faculty", (java.util.List<java.lang.String[]>) strArrayList12);
        database0.removeAllSubscribers();
        boolean boolean18 = false; // flaky: database0.delete("Faculty", (int) (byte) 0);
        com.parkingbookingsystem.ParkingLot parkingLot22 = new com.parkingbookingsystem.ParkingLot("Non-Faculty Staff");
        java.lang.String[] strArray23 = parkingLot22.serialize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = database0.update("Sensor ID: 0, Parking Space ID: 10, Car Detected: false", 155, strArray23);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: src/main/java/data/DB_Sensor ID: 0, Parking Space ID: 10, Car Detected: false.csv (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 1);
        booking12.setStatus("");
        com.parkingbookingsystem.Booking booking18 = booking12.status("{ email='', password='hi!', type='Visitor'}");
        com.parkingbookingsystem.Booking booking20 = booking18.parkingLotId((int) (byte) 10);
        com.parkingbookingsystem.Booking booking22 = booking20.depositAmount((double) 0.0f);
        com.parkingbookingsystem.Booking booking24 = booking22.licensePlate("{ parkingId='152', location='Student', enabled='false'}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking24);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.GetParkingLotByIdCommand getParkingLotByIdCommand2 = new com.parkingbookingsystem.commands.GetParkingLotByIdCommand(controller0, (int) '4');
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand6 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, (double) (-1L), "Non-Faculty Staff", (int) (byte) 1);
        controller0.enableParkingLotById((int) (short) 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand4 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "", 100, 10);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult6 = controller0.getUserById("Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor8 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.sensor(sensor8);
        com.parkingbookingsystem.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = sensor10.getParkingSpaceId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        booking12.setParkingLotId((int) (short) 0);
        boolean boolean15 = booking12.isCheckedIn();
        com.parkingbookingsystem.Booking booking17 = booking12.depositAmount((double) (byte) 1);
        com.parkingbookingsystem.Booking booking19 = booking17.userId("");
        java.util.Date date20 = null;
        com.parkingbookingsystem.Booking booking21 = booking19.endTime(date20);
        java.util.Date date22 = null;
        com.parkingbookingsystem.Booking booking23 = booking21.endTime(date22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking23);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus1 = null;
        com.parkingbookingsystem.ParkingLot parkingLot4 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace6 = parkingLot4.getParkingSpaceById(35);
        parkingSpace6.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor11 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace12 = parkingSpace6.sensor(sensor11);
        boolean boolean13 = sensor11.isCarDetected();
        sensor11.setCarDetected(false);
        java.lang.String str16 = sensor11.sendInfoToSystem();
        com.parkingbookingsystem.ParkingSpace parkingSpace18 = new com.parkingbookingsystem.ParkingSpace((int) (byte) 10, parkingStatus1, 100, sensor11, "{ paymentId='129', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Sensor ID: 0, Parking Space ID: 10, Car Detected: false" + "'", str16.equals("Sensor ID: 0, Parking Space ID: 10, Car Detected: false"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.parkingbookingsystem.Student student2 = new com.parkingbookingsystem.Student("Visitor", "");
        boolean boolean4 = student2.canLogin("Student");
        java.lang.String[] strArray5 = student2.serialize();
        java.lang.String[] strArray6 = student2.serialize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        parkingSpace3.setParkingSpaceId((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        com.parkingbookingsystem.Booking booking16 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date10, date11, date12, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int17 = booking16.getParkingSpaceId();
        com.parkingbookingsystem.commands.CheckInToBookingCommand checkInToBookingCommand18 = new com.parkingbookingsystem.commands.CheckInToBookingCommand(controller0, booking16);
        booking16.setParkingSpaceId(100);
        com.parkingbookingsystem.Booking booking22 = booking16.bookingId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking22);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        com.parkingbookingsystem.Booking booking12 = new com.parkingbookingsystem.Booking((int) (short) 10, "hi!", (int) (byte) 10, (int) (byte) 1, (double) 0L, (double) 100, date6, date7, date8, true, "Non-Faculty Staff", "{ email='', password='hi!', type='Visitor'}");
        int int13 = booking12.getParkingLotId();
        com.parkingbookingsystem.Booking booking15 = booking12.parkingSpaceId((int) (byte) 10);
        boolean boolean16 = booking15.isCheckedIn();
        com.parkingbookingsystem.Booking booking18 = booking15.parkingSpaceId(185);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = booking15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"this.checkInTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking18);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.parkingbookingsystem.EtransferStrategy etransferStrategy0 = new com.parkingbookingsystem.EtransferStrategy();
        com.parkingbookingsystem.Payment payment6 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment6.setPaymentMethod("{ email='', password='hi!', type='Visitor'}");
        boolean boolean9 = etransferStrategy0.processPayment(payment6);
        com.parkingbookingsystem.Payment payment11 = payment6.paymentMethod("Faculty");
        java.lang.String str12 = payment6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment11);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{ paymentId='162', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod='Faculty'}" + "'", str12.equals("{ paymentId='162', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod='Faculty'}"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        controller0.enableParkingSpaceById(100, 1);
        com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand getUnvalidatedClientsCommand4 = new com.parkingbookingsystem.commands.GetUnvalidatedClientsCommand(controller0);
        com.parkingbookingsystem.commands.AddPaymentCommand addPaymentCommand8 = new com.parkingbookingsystem.commands.AddPaymentCommand(controller0, 1.0d, "Faculty", 1);
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.Booking> bookingResult10 = controller0.getBookingById(1);
        com.parkingbookingsystem.commands.CreateUserCommand createUserCommand14 = new com.parkingbookingsystem.commands.CreateUserCommand(controller0, "Sensor ID: 0, Parking Space ID: 10, Car Detected: false", "Super Manager", "Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingResult10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor8 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.sensor(sensor8);
        com.parkingbookingsystem.Sensor sensor10 = parkingSpace3.getSensor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        controller0.disableParkingSpaceById(1, (int) (byte) -1);
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        controller0.modifyParkingSpaceBooking("", (int) (short) 1, 35, 138, "", date21, date22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.parkingbookingsystem.User user3 = new com.parkingbookingsystem.User("Super Manager", "Location 35", "{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.parkingbookingsystem.Student student2 = new com.parkingbookingsystem.Student("", "Student");
        student2.setType("{ paymentId='162', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod='Faculty'}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.parkingbookingsystem.Student student2 = new com.parkingbookingsystem.Student("", "Student");
        boolean boolean3 = student2.isValidated();
        student2.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor8 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.sensor(sensor8);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus10 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE;
        parkingSpace9.setStatus(parkingStatus10);
        com.parkingbookingsystem.ParkingLot parkingLot13 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace15 = parkingLot13.getParkingSpaceById(35);
        parkingSpace15.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor20 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace21 = parkingSpace15.sensor(sensor20);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus22 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE;
        parkingSpace21.setStatus(parkingStatus22);
        parkingSpace9.setStatus(parkingStatus22);
        parkingSpace9.setParkingSpaceId(0);
        parkingSpace9.setParkingLotId((int) '4');
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus29 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE;
        com.parkingbookingsystem.ParkingSpace parkingSpace30 = parkingSpace9.status(parkingStatus29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + parkingStatus10 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE + "'", parkingStatus10.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + parkingStatus22 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE + "'", parkingStatus22.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE));
        org.junit.Assert.assertTrue("'" + parkingStatus29 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE + "'", parkingStatus29.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OUT_OF_SERVICE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace30);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.parkingbookingsystem.ParkingLot parkingLot1 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpaceById(35);
        parkingSpace3.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus6 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE;
        parkingSpace3.setStatus(parkingStatus6);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus8 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.RESERVED;
        com.parkingbookingsystem.ParkingSpace parkingSpace9 = parkingSpace3.status(parkingStatus8);
        com.parkingbookingsystem.ParkingSpace.ParkingStatus parkingStatus11 = com.parkingbookingsystem.ParkingSpace.ParkingStatus.OCCUPIED;
        com.parkingbookingsystem.ParkingLot parkingLot14 = new com.parkingbookingsystem.ParkingLot("Student");
        com.parkingbookingsystem.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpaceById(35);
        parkingSpace16.setParkingSpaceId((int) (byte) 0);
        com.parkingbookingsystem.Sensor sensor21 = new com.parkingbookingsystem.Sensor(0, (int) (byte) 10);
        com.parkingbookingsystem.ParkingSpace parkingSpace22 = parkingSpace16.sensor(sensor21);
        int int23 = sensor21.getSensorId();
        com.parkingbookingsystem.ParkingSpace parkingSpace25 = new com.parkingbookingsystem.ParkingSpace(185, parkingStatus11, (int) (byte) -1, sensor21, "hi!");
        com.parkingbookingsystem.ParkingSpace parkingSpace26 = parkingSpace9.status(parkingStatus11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + parkingStatus6 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE + "'", parkingStatus6.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + parkingStatus8 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.RESERVED + "'", parkingStatus8.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.RESERVED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + parkingStatus11 + "' != '" + com.parkingbookingsystem.ParkingSpace.ParkingStatus.OCCUPIED + "'", parkingStatus11.equals(com.parkingbookingsystem.ParkingSpace.ParkingStatus.OCCUPIED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace26);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setPaymentMethod("{ email='', password='hi!', type='Visitor'}");
        com.parkingbookingsystem.Payment payment9 = payment5.status("{ paymentId='145', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(payment9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.parkingbookingsystem.commands.Result<java.lang.reflect.GenericDeclaration> genericDeclarationResult0 = new com.parkingbookingsystem.commands.Result<java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.User> userResult2 = controller0.getUserById("hi!");
        controller0.disableParkingLotById((int) (byte) 10);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        controller0.modifyParkingSpaceBooking("", (int) 'a', (int) '4', (int) (short) 0, "", date10, date11);
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand13 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        com.parkingbookingsystem.commands.ValidateUserCommand validateUserCommand15 = new com.parkingbookingsystem.commands.ValidateUserCommand(controller0, "{ paymentId='133', userId='hi!', bookingId='35', amount='-1.0', status='', paymentMethod=''}");
        controller0.disableParkingSpaceById((-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userResult2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.parkingbookingsystem.Faculty faculty2 = new com.parkingbookingsystem.Faculty("{ parkingId='152', location='Student', enabled='false'}", "{ parkingId='152', location='Student', enabled='false'}");
        double double3 = faculty2.getRate();
        double double4 = faculty2.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.0d + "'", double3 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        payment5.setAmount((double) 1);
        payment5.setStatus("Visitor");
        int int10 = payment5.getBookingId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.String[] strArray0 = com.parkingbookingsystem.Payment.PAYMENT_TYPES;
        com.parkingbookingsystem.User user1 = com.parkingbookingsystem.UserFactory.createUser(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.parkingbookingsystem.Staff staff2 = new com.parkingbookingsystem.Staff("hi!", "");
        java.lang.String[] strArray3 = staff2.serialize();
        staff2.setType("{ paymentId='119', userId='hi!', bookingId='35', amount='1.0', status='', paymentMethod=''}");
        java.lang.String str6 = staff2.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.parkingbookingsystem.Payment payment5 = new com.parkingbookingsystem.Payment("hi!", (int) '#', (double) (short) -1, "", "");
        java.lang.String str6 = payment5.getUserId();
        payment5.setAmount((double) 0L);
        java.lang.String str9 = payment5.getStatus();
        int int10 = payment5.getBookingId();
        payment5.setPaymentMethod("{ email='', password='hi!', type='Visitor'}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.parkingbookingsystem.Controller controller0 = new com.parkingbookingsystem.Controller();
        com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand cancelParkingSpaceBookingCommand4 = new com.parkingbookingsystem.commands.CancelParkingSpaceBookingCommand(controller0, "", 100, 10);
        controller0.cancelParkingSpaceBooking("Visitor", (int) (short) -1, (int) ' ');
        com.parkingbookingsystem.commands.Result<com.parkingbookingsystem.ParkingLot> parkingLotResult10 = controller0.getParkingLotById(100);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Booking>> bookingListResult12 = controller0.getBookingsForUser("Student");
        com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand getAvailableParkingSpaceListCommand13 = new com.parkingbookingsystem.commands.GetAvailableParkingSpaceListCommand(controller0);
        com.parkingbookingsystem.commands.Result<java.util.List<com.parkingbookingsystem.Client>> clientListResult14 = controller0.getUnvalidatedClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotResult10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingListResult12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientListResult14);
    }
}
