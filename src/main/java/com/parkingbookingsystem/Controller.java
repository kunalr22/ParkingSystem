package com.parkingbookingsystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.parkingbookingsystem.commands.Result;

public class Controller {
    private final Database db;
    private ArrayList<ParkingLot> parkingLotList;
    private ArrayList<Booking> bookingList;
    private ArrayList<User> userList;
    private ArrayList<Payment> paymentsList;


    public Controller() {
        db = Database.getInstance();
        
        // read all data from database and initialize the system
        parkingLotList = new ArrayList<>();
        bookingList = new ArrayList<>();
        userList = new ArrayList<>();
        paymentsList = new ArrayList<>();

        try {
            db.readAll("ParkingLots").forEach( p -> parkingLotList.add(ParkingLot.deserialize(p)));
            for (String[] str: db.readAll("ParkingSpaces")) {
                ParkingSpace space = ParkingSpace.deserialize(str);
                getParkingLotById(space.getParkingLotId()).getResult().getSpaces()[space.getParkingSpaceId() - 1] = space;
            }
        } catch (IOException e) {
            System.err.println("Error reading data from database: " + e.getMessage());
        }

        try {
            db.readAll("Users").forEach(u -> userList.add(UserFactory.createUser(u)));
        } catch (IOException e) {
            System.err.println("Error reading data from database: " + e.getMessage());
        }

        try {
            db.readAll("Payments").forEach(p -> paymentsList.add(Payment.deserialize(p)));
        } catch (IOException e) {
            System.err.println("Error reading data from database: " + e.getMessage());
        }

        try {
            db.readAll("Bookings").forEach(b -> bookingList.add(Booking.deserialize(b)));
        } catch (IOException e) {
            System.err.println("Error reading data from database: " + e.getMessage());
        }

        // check if a super manager exists
        boolean supermanagerExists = false;
        boolean client100Exists = false;
        for (User u: userList) {
            if (u.getType().equals("Super Manager")) {
                supermanagerExists = true;
            }
            if (u.getEmail().equals("client100@email.com")) {
                client100Exists = true;
            }
        }

        // create a super manager if it doesn't exist
        if (!supermanagerExists) {
            User superManager = UserFactory.createUser("super@parking.system", "SManager@1234", "Super Manager");
            userList.add(superManager);
            try {
                db.insert("Users", superManager.serialize());
            } catch (IOException e) {
                System.err.println("Error saving super manager: " + e.getMessage());
            }
        }

        if (!client100Exists) {
            User client100 = UserFactory.createUser("client100@email.com", "Client@1234", "Visitor", "true");
            userList.add(client100);
            try {
                db.insert("Users", client100.serialize());
            } catch (IOException e) {
                System.err.println("Error saving client 100: " + e.getMessage());
            }
        }
    }
    
    public Result<User> getUserById(String email) {
        Result<User> result = new Result<>();
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                result.setResult(user);
                return result;
            }
        }
        result.setResult(null);
        return result;
    }

    public Result<User> createUser (String email, String password, String type) throws IllegalArgumentException {
        if (!User.clientEmailValid(email))
            throw new IllegalArgumentException("Invalid email format.");

        if (!User.passwordValid(password))
            throw new IllegalArgumentException("Password must contain at least 8 characters, including uppercase, lowercase, numbers, and special characters.");
        
        for (User user : userList) {
            if (user.getEmail().equals(email))
                throw new IllegalArgumentException("Email already exists.");
        }

        // create a new client object and save it to database
        User user = UserFactory.createUser(email, password, type); //save this on database
        userList.add(user);
        try {
            db.insert("Users", user.serialize());
        } catch (IOException e) {
            System.err.println("Error saving user: " + e.getMessage());
        }
        Result<User> result = new Result<>();
        result.setResult(user);
        return result;
    }

    public Result<List<Client>> getUnvalidatedClients() {
        ArrayList<Client> clients = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Client && !((Client) user).isValidated())
                clients.add((Client)user);
        }
        Result<List<Client>> result = new Result<>();
        result.setResult(clients);
        return result;
    }

    public void validateUser(String email) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getEmail().equals(email) && userList.get(i) instanceof Client) {
                Client client = (Client) userList.get(i);
                client.validate();
                try {
                    db.update("Users", i, client.serialize());
                } catch (IOException e) {
                    System.err.println("Error updating user: " + e.getMessage());
                }
                break;
            }
        }
    }

    public void deleteUser(String email) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getEmail().equals(email)) {
                userList.remove(i);
                try {
                    db.delete("Users", i);
                } catch (IOException e) {
                    System.err.println("Error deleting user: " + e.getMessage());
                }
                break;
            }
        }
    }

    public Result<List<Booking>> getBookingsForUser(String email) {
        Result<List<Booking>> result = new Result<>();
        result.setResult(bookingList.stream().filter(booking -> booking.getUserId().equals(email)).toList());
        return result;
    }

    public Result<Booking> getBookingById(int id) {
        Result<Booking> result = new Result<>();
        for (Booking booking : bookingList) {
            if (booking.getBookingId() == id) {
                result.setResult(booking);
                return result;
            }
        }
        result.setResult(null);
        return result;
    }

    public void addPayment(double amount, String method, int bookingId) {
        Booking booking = getBookingById(bookingId).getResult();
        Payment payment = new Payment(booking.getUserId(), bookingId, amount, "paid", method);
        payment.ProcessPayment();
        paymentsList.add(payment);
        booking.setStatus("paid");
        try {
            db.insert("Payments", payment.serialize());
            db.update("Bookings", bookingList.indexOf(booking), booking.serialize());
        } catch (IOException e) {
            System.err.println("Error saving payment: " + e.getMessage());
        }
    }

    public Result<List<ParkingSpace>> getAvailableParkingSpaceList() {
        ArrayList<ParkingSpace> spaces = new ArrayList<ParkingSpace>();
        for (ParkingLot p : getParkingLotList().getResult())
            spaces.addAll(p.getAvailableParkingSpaceList());
        Result<List<ParkingSpace>> result = new Result<>();
        result.setResult(spaces);
        return result;
    }

    public Booking bookParkingSpace(String currUserEmail, int parkingSpaceId, int parkingLotId, String licensePlate, Date from, Date to) throws IllegalArgumentException {
        // to do
        // check if everything is ok, parking spot is available
        // user can book, etc.
        for (Booking booking : bookingList) {
            if (booking.getParkingSpaceId() == parkingSpaceId && booking.getParkingLotId() == parkingLotId) {
                if (booking.getStartTime().before(to) && booking.getEndTime().after(from))
                    throw new IllegalArgumentException("Parking space is already booked for this time.");
            }
        }
        Booking booking = new Booking(currUserEmail,parkingSpaceId,parkingLotId, ((Client) getUserById(currUserEmail).getResult()).getRate(), from, to, licensePlate);
        bookingList.add(booking);
        try {
            db.insert("Bookings", booking.serialize());
        } catch (IOException e) {
            System.err.println("Error saving booking: " + e.getMessage());
        }
        return booking;
    }

    public void disableParkingLotById(int parkingLotId) {
        for (int i = 0; i < parkingLotList.size(); i++) {
            if (parkingLotList.get(i).getParkingLotId() == parkingLotId) {
                parkingLotList.get(i).disable();
                
                ParkingSpace[] ps = parkingLotList.get(i).getSpaces();
                for (int j =0; j<100; j++) {
                    ps[j].disable();
                    try {
                        db.update("ParkingSpaces", i * 100 + j, ps[j].serialize());
                    } catch (IOException e) {
                        System.err.println("Error updating ParkingSpace: " + e.getMessage());
                    }
                }

                try {
                    db.update("ParkingLots", i, parkingLotList.get(i).serialize());
                } catch (IOException e) {
                    System.err.println("Error updating ParkingLot: " + e.getMessage());
                }
                break;
            }
        }
    }

    public void enableParkingLotById(int parkingLotId) {
        for (int i = 0; i < parkingLotList.size(); i++) {
            if (parkingLotList.get(i).getParkingLotId() == parkingLotId) {
                parkingLotList.get(i).enable();
                
                ParkingSpace[] ps = parkingLotList.get(i).getSpaces();
                for (int j =0; j<100; j++) {
                    ps[j].enable();
                    try {
                        db.update("ParkingSpaces", i * 100 + j, ps[j].serialize());
                    } catch (IOException e) {
                        System.err.println("Error updating ParkingSpace: " + e.getMessage());
                    }
                }

                try {
                    db.update("ParkingLots", i, parkingLotList.get(i).serialize());
                } catch (IOException e) {
                    System.err.println("Error updating ParkingLot: " + e.getMessage());
                }
                break;
            }
        }
    }

    public void disableParkingSpaceById(int parkingLotId, int parkingSpaceId) {
        for (int i = 0; i < parkingLotList.size(); i++) {
            if (parkingLotList.get(i).getParkingLotId() == parkingLotId) {
                for (int j=0; j <100; j++) {
                    if (parkingLotList.get(i).getSpaces()[j].getParkingSpaceId() == parkingSpaceId) {
                        parkingLotList.get(i).getSpaces()[j].disable();
                        try {
                            db.update("ParkingSpaces", i * 100 + j, parkingLotList.get(i).getSpaces()[j].serialize());
                        } catch (IOException e) {
                            System.err.println("Error updating ParkingLot: " + e.getMessage());
                        }
                    }
                }
                
                break;
            }
        }
    }

    public void enableParkingSpaceById(int parkingLotId, int parkingSpaceId) {
        for (int i = 0; i < parkingLotList.size(); i++) {
            if (parkingLotList.get(i).getParkingLotId() == parkingLotId) {
                for (int j=0; j <100; j++) {
                    if (parkingLotList.get(i).getSpaces()[j].getParkingSpaceId() == parkingSpaceId) {
                        parkingLotList.get(i).getSpaces()[j].enable();
                        try {
                            db.update("ParkingSpaces", i * 100 + j, parkingLotList.get(i).getSpaces()[j].serialize());
                        } catch (IOException e) {
                            System.err.println("Error updating ParkingLot: " + e.getMessage());
                        }
                    }
                }
                
                break;
            }
        }
    }

    public Booking modifyParkingSpaceBooking(String currUserEmail, int bookingId, int parkingSpaceId, int parkingLotId, String licensePlate, Date from, Date to) throws IllegalArgumentException {
        // to do
        // check if everything is ok, parking spot is available
        // user can book/modify booking etc.
        for (Booking booking : bookingList) {
            if (booking.getParkingSpaceId() == parkingSpaceId && booking.getParkingLotId() == parkingLotId) {
                if (booking.getUserId().equals(currUserEmail) && booking.getBookingId() == bookingId) {
                    if (booking.getStartTime().before(from))
                        throw new IllegalArgumentException("The booking has already started. It cannot be modified anymore.");
                } else {
                    if (booking.getStartTime().before(to) && booking.getEndTime().after(from))
                        throw new IllegalArgumentException("Parking space is already booked for this time.");
                }
            }
        }
        for (int i = 0; i < bookingList.size(); i++) {
            Booking b = bookingList.get(i);
            if (b.getUserId().equals(currUserEmail) && b.getParkingSpaceId() == parkingSpaceId && b.getParkingLotId() == parkingLotId) {
                b.setLicensePlate(licensePlate);
                b.setStartTime(from);
                b.setEndTime(to);
                long hours = (to.getTime() - from.getTime() ) / (1000 * 60 * 60);
                b.setRemainingAmount(hours * b.getDepositAmount());
                try {
                    db.update("Bookings", i, b.serialize());
                } catch (IOException e) {
                    System.err.println("Error updating booking: " + e.getMessage());
                }
                return b;
            }
        }
        return null;
    }

    public void cancelParkingSpaceBooking(String currUserEmail, int parkingLotId, int parkingSpaceId) throws IllegalArgumentException {
        for (int i = 0; i < bookingList.size(); i++) {
            Booking b = bookingList.get(i);
            if (b.getUserId().equals(currUserEmail) && b.getParkingSpaceId() == parkingSpaceId && b.getParkingLotId() == parkingLotId) {
                if (b.getStartTime().before(new Date()))
                    throw new IllegalArgumentException("The booking has already started. It cannot be cancelled anymore.");
                bookingList.remove(i);
                try {
                    db.delete("Bookings", i);
                } catch (IOException e) {
                    System.err.println("Error deleting booking: " + e.getMessage());
                }
                break;
            }
        }
    }

    public void checkIntoBooking(Booking booking) {
        booking.setCheckInTime(new Date());
        ParkingLot lot = getParkingLotById(booking.getParkingLotId()).getResult();
        ParkingSpace space = lot.getParkingSpaceById(booking.getParkingSpaceId());
        Sensor sensor = space.getSensor();
        sensor.setCarDetected(true);
        sensor.scanCarInfo();
        try {
            db.update("Bookings", bookingList.indexOf(booking), booking.serialize());
        } catch (Exception e) {
            System.err.println("Error updating booking: " + e.getMessage());
        }
    }

    public Result<List<ParkingLot>> getParkingLotList() {
        Result<List<ParkingLot>> result = new Result<>();
        result.setResult(parkingLotList);
        return result;
    }

    public Result<ParkingLot> getParkingLotById(int parkingLotId) {
        Result<ParkingLot> result = new Result<>();
        for (ParkingLot p: getParkingLotList().getResult())
            if (p.getParkingLotId() == parkingLotId) {
                result.setResult(p);
                return result;
            }
        result.setResult(null);
        return result;
    }

    public Result<User> generateManager() throws IOException {
        int randomNum = (int)(Math.random() * 9000) + 1000;
        int randomPass = (int)(Math.random() * 90000000) + 10000000;
        User m = UserFactory.createUser("manager" + randomNum + "@parking.system", "" + randomPass, Manager.TYPE);
        userList.add(m);
        db.insert("Users", m.serialize());
        Result<User> result = new Result<>();
        result.setResult(m);
        return result;
    }

    public ParkingLot createParkingLot(String location) throws IOException {
        ParkingLot p = new ParkingLot(location);
        parkingLotList.add(p);
        for (ParkingSpace ps: p.getSpaces()) {
            db.insert("ParkingSpaces", ps.serialize());
        }
        db.insert("ParkingLots", p.serialize());
        return p;
    }
}
