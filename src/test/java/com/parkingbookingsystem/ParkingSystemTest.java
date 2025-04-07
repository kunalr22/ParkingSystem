package com.parkingbookingsystem;

import com.parkingbookingsystem.Booking;
import com.parkingbookingsystem.Controller;
import com.parkingbookingsystem.ParkingSpace;
import com.parkingbookingsystem.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ParkingSystemTest {

    private Controller controller;

    @Before
    public void setUp() {
        controller = new Controller();
    }

    @Test
    public void testCreateUser_success() {
        User user = controller.createUser("testuser@example.com", "Password@123", "Client").getResult();
        assertNotNull(user);
        assertEquals("testuser@example.com", user.getEmail());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateUser_duplicateEmail_throwsException() {
        controller.createUser("duplicate@example.com", "Password@123", "Client");
        controller.createUser("duplicate@example.com", "Password@123", "Client");
    }

    @Test
    public void testGetUserById_returnsCorrectUser() {
        controller.createUser("findme@example.com", "Password@123", "Client");
        User user = controller.getUserById("findme@example.com").getResult();
        assertNotNull(user);
    }

    @Test
    public void testGenerateManager_createsManager() throws Exception {
        User manager = controller.generateManager().getResult();
        assertNotNull(manager);
        assertEquals("Manager", manager.getType());
    }

    @Test
    public void testGetAvailableParkingSpaces_returnsNonEmptyList() {
        List<ParkingSpace> spaces = controller.getAvailableParkingSpaceList().getResult();
        assertNotNull(spaces);
        assertFalse(spaces.isEmpty());
    }

    @Test
    public void testBookAndCancelParkingSpace_flowWorksCorrectly() {
        String email = "booker@example.com";
        controller.createUser(email, "Password@123", "Client");

        ParkingSpace space = controller.getAvailableParkingSpaceList().getResult().get(0);
        Date start = new Date(System.currentTimeMillis() + 3600 * 1000);
        Date end = new Date(start.getTime() + 2 * 3600 * 1000);

        controller.bookParkingSpace(email, space.getParkingSpaceId(), space.getParkingLotId(), "ABC123", start, end);
        List<Booking> bookings = controller.getBookingsForUser(email).getResult();
        assertFalse(bookings.isEmpty());

        controller.cancelParkingSpaceBooking(email, space.getParkingLotId(), space.getParkingSpaceId());
        assertTrue(controller.getBookingsForUser(email).getResult().isEmpty());
    }

    @Test
    public void testAddPayment_updatesBookingStatus() {
        String email = "payuser@example.com";
        controller.createUser(email, "Password@123", "Client");

        ParkingSpace space = controller.getAvailableParkingSpaceList().getResult().get(0);
        Date start = new Date(System.currentTimeMillis() + 3600 * 1000);
        Date end = new Date(start.getTime() + 2 * 3600 * 1000);

        controller.bookParkingSpace(email, space.getParkingSpaceId(), space.getParkingLotId(), "XYZ789", start, end);
        Booking booking = controller.getBookingsForUser(email).getResult().get(0);

        controller.addPayment(20.0, "CreditCard", booking.getBookingId());
        assertEquals("paid", booking.getStatus());
    }
}
