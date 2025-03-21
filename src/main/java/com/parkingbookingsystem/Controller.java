package com.parkingbookingsystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controller {
    private final Database db;
    private ArrayList<ParkingLot> parkingLotList;
    private ArrayList<Booking> bookingList;
    private ArrayList<User> userList;
    private ArrayList<Payment> paymentsList;


    public Controller() {
        // initialize database connection
        db = Database.getInstance("src/main/java/data/DB");
        
        // read all data from database and initialize the system
        parkingLotList = new ArrayList<ParkingLot>();
        bookingList = new ArrayList<Booking>();
        userList = new ArrayList<User>();
        paymentsList = new ArrayList<Payment>();

        try {
            db.readAll("ParkingLots").forEach( p -> parkingLotList.add(ParkingLot.deserialize(p)));
            for (String[] str: db.readAll("ParkingSpaces")) {
                ParkingSpace space = ParkingSpace.deserialize(str);
                getParkingLotById(space.getParkingLotId()).getSpaces()[space.getParkingSpaceId() - 1] = space;
            }
        } catch (IOException e) {
            System.err.println("Error reading data from database: " + e.getMessage());
        }

        try {
            db.readAll("Users").forEach(u -> userList.add(User.deserialize(u)));
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
        for (User u: userList) {
            if (u.getType().equals("super manager")) {
                supermanagerExists = true;
                break;
            }
        }

        // create a super manager if it doesn't exist
        if (!supermanagerExists) {
            User superManager = new User("super@parking.system", "123", "super manager");
            userList.add(superManager);
            try {
                db.insert("Users", superManager.serialize());
            } catch (Exception e) {
                System.err.println("Error saving super manager: " + e.getMessage());
            }
        }
    }
    
    public User getUserById(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email))
                return user;
        }
        return null;
    }

    public User createClient (String email, String password, String type) throws IllegalArgumentException {
        if (!User.emailValid(email))
            throw new IllegalArgumentException("Invalid email format.");

        if (!User.passwordValid(password))
            throw new IllegalArgumentException("Password must contain at least 8 characters, including uppercase, lowercase, numbers, and special characters.");
        
        for (User user : userList) {
            if (user.getEmail().equals(email))
                throw new IllegalArgumentException("Email already exists.");
        }

        // create a new client object and save it to database
        Client client = new Client(email, password, type); //save this on database
        userList.add(client);
        try {
            db.insert("Users", client.serialize());
        } catch (Exception e) {
            System.err.println("Error saving user: " + e.getMessage());
        }
        return client;
    }

    public List<Client> getUnvalidatedClients() {
        ArrayList<Client> clients = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Client && !((Client) user).isValidated())
                clients.add((Client)user);
        }
        return clients;
    }

    public void validateUser(String email) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getEmail().equals(email) && userList.get(i) instanceof Client) {
                Client client = (Client) userList.get(i);
                client.validate();
                try {
                    db.update("Users", i, client.serialize());
                } catch (Exception e) {
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
                } catch (Exception e) {
                    System.err.println("Error deleting user: " + e.getMessage());
                }
                break;
            }
        }
    }

    public List<Booking> getBookingsForUser(String email) {
        return bookingList.stream().filter(booking -> booking.getUserId().equals(email)).toList();
    }

    public Booking getBookingById(int id) {
        for (Booking booking : bookingList) {
            if (booking.getBookingId() == id)
                return booking;
        }
        return null;
    }

    public void addPayment(double amount, String method, int bookingId) {
        Payment payment = new Payment( getBookingById(bookingId).getUserId(), bookingId, amount, "paid", method);
        paymentsList.add(payment);
        try {
            db.insert("Payments", payment.serialize());
        } catch (Exception e) {
            System.err.println("Error saving payment: " + e.getMessage());
        }
    }

    public List<ParkingSpace> getAvailablePakingSpaceList() {
        ArrayList<ParkingSpace> spaces = new ArrayList<ParkingSpace>();
        for (ParkingLot p : getParkingLotList())
            spaces.addAll(p.getAvailablePakingSpaceList());
        return spaces;
    }

    public void bookParkingSpace(String currUserEmail, int parkingSpaceId, int parkingLotId, String licensePlate, Date from, Date to) throws IllegalArgumentException {
        // to do
        // check if everything is ok, parking spot is available
        // user can book, etc.
        Booking booking = new Booking(currUserEmail,parkingSpaceId,parkingLotId, ((Client) getUserById(currUserEmail)).getRate(), from, to, licensePlate);
        bookingList.add(booking);
        try {
            db.insert("Bookings", booking.serialize());
        } catch (Exception e) {
            System.err.println("Error saving booking: " + e.getMessage());
        }
    }

    public void modifyParkingSpaceBooking(String currUserEmail, int parkingSpaceId, int parkingLotId, String licensePlate, Date from, Date to) throws IllegalArgumentException {
        // to do
        // check if everything is ok, parking spot is available
        // user can book/modify booking etc.
        for (int i = 0; i < bookingList.size(); i++) {
            Booking b = bookingList.get(i);
            if (b.getUserId().equals(currUserEmail) && b.getParkingSpaceId() == parkingSpaceId && b.getParkingLotId() == parkingLotId) {
                b.setLicensePlate(licensePlate);
                b.setStartTime(from);
                b.setEndTime(to);
                try {
                    db.update("Bookings", i, b.serialize());
                } catch (Exception e) {
                    System.err.println("Error updating booking: " + e.getMessage());
                }
                break;
            }
        }
    }

    public void cancelParkingSpaceBooking(String currUserEmail, int parkingLotId, int parkingSpaceId) {
        // to do
        // check if user can modify/cancel booking etc.
        for (int i = 0; i < bookingList.size(); i++) {
            Booking b = bookingList.get(i);
            if (b.getUserId().equals(currUserEmail) && b.getParkingSpaceId() == parkingSpaceId && b.getParkingLotId() == parkingLotId) {
                bookingList.remove(i);
                try {
                    db.delete("Bookings", i);
                } catch (Exception e) {
                    System.err.println("Error deleting booking: " + e.getMessage());
                }
                break;
            }
        }
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public ParkingLot getParkingLotById(int parkingLotId) {
        for (ParkingLot p: getParkingLotList())
            if (p.getParkingLotId() == parkingLotId)
                return p;
        return null;
    }

    public User generateManager() throws IOException {
        int randomNum = (int)(Math.random() * 900) + 100;
        int randomPass = (int)(Math.random() * 900) + 100;
        User m = new User("manager" + randomNum + "@parking.system", "" + randomPass, "manager");
        userList.add(m);
        db.insert("Users", m.serialize());
        return m;
    }

    public void createParkingLot(String location) throws IOException {
        ParkingLot p = new ParkingLot(location);
        parkingLotList.add(p);
        for (ParkingSpace ps: p.getSpaces()) {
            db.insert("ParkingSpaces", ps.serialize());
        }
        db.insert("ParkingLots", p.serialize());
    }
}
