package com.parkingbookingsystem;

import java.util.Date;
import java.util.Objects;

public class Booking {
    private int bookingId, parkingSpaceId, parkingLotId;
    private static int counter = 0;
    private String userId; // email address
    private double remainingAmount;
    private double depositAmount;
    private Date startTime, endTime;
    private String licensePlate;
    private String status; // paid, pending confirmation, confirmed

    public Booking(String userId, int parkingSpaceId, int parkingLotId, double depositAmount, Date startTime, Date endTime, String licensePlate) {
        this.bookingId = ++counter;
        this.userId = userId;
        this.parkingSpaceId = parkingSpaceId;
        this.parkingLotId = parkingLotId;
        long hours = ( endTime.getTime() - startTime.getTime() ) / 1000 * 60 * 60;
        this.remainingAmount = depositAmount * (hours - 1);
        this.depositAmount = depositAmount;
        this.startTime = startTime;
        this.endTime = endTime;
        this.licensePlate = licensePlate;
        this.status = "pending confirmation";
    }
    

    public Booking(int bookingId, String userId, int parkingSpaceId, int parkingLotId, double remainingAmount, double depositAmount, Date startTime, Date endTime, String licensePlate, String status) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.parkingSpaceId = parkingSpaceId;
        this.parkingLotId = parkingLotId;
        this.remainingAmount = remainingAmount;
        this.depositAmount = depositAmount;
        this.startTime = startTime;
        this.endTime = endTime;
        this.licensePlate = licensePlate;
        this.status = status;
        if (counter < bookingId) counter = bookingId;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Booking licensePlate(String licensePlate) {
        setLicensePlate(licensePlate);
        return this;
    }


    public int getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getParkingSpaceId() {
        return this.parkingSpaceId;
    }

    public void setParkingSpaceId(int parkingSpaceId) {
        this.parkingSpaceId = parkingSpaceId;
    }

    public int getParkingLotId() {
        return this.parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public double getRemainingAmount() {
        return this.remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public double getDepositAmount() {
        return this.depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date enableTime) {
        this.endTime = enableTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Booking bookingId(int bookingId) {
        setBookingId(bookingId);
        return this;
    }

    public Booking userId(String userId) {
        setUserId(userId);
        return this;
    }

    public Booking parkingSpaceId(int parkingSpaceId) {
        setParkingSpaceId(parkingSpaceId);
        return this;
    }

    public Booking parkingLotId(int parkingLotId) {
        setParkingLotId(parkingLotId);
        return this;
    }

    public Booking remainingAmount(double remainingAmount) {
        setRemainingAmount(remainingAmount);
        return this;
    }

    public Booking depositAmount(double depositAmount) {
        setDepositAmount(depositAmount);
        return this;
    }

    public Booking startTime(Date startTime) {
        setStartTime(startTime);
        return this;
    }

    public Booking endTime(Date enableTime) {
        setEndTime(enableTime);
        return this;
    }

    public Booking status(String status) {
        setStatus(status);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Booking)) {
            return false;
        }
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId && Objects.equals(userId, booking.userId) && Objects.equals(parkingSpaceId, booking.parkingSpaceId) && Objects.equals(parkingLotId, booking.parkingLotId) && remainingAmount == booking.remainingAmount && depositAmount == booking.depositAmount && Objects.equals(startTime, booking.startTime) && Objects.equals(endTime, booking.endTime) && Objects.equals(status, booking.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, userId, parkingSpaceId, parkingLotId, remainingAmount, depositAmount, startTime, endTime, status);
    }

    @Override
    public String toString() {
        return "{" +
            " bookingId='" + getBookingId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", parkingSpaceId='" + getParkingSpaceId() + "'" +
            ", parkingLotId='" + getParkingLotId() + "'" +
            ", remainingAmount='" + getRemainingAmount() + "'" +
            ", depositAmount='" + getDepositAmount() + "'" +
            ", startTime='" + getStartTime() + "'" +
            ", enableTime='" + getEndTime() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }

    public String[] serialize() {
        return new String[] {
            Integer.toString(bookingId), 
            userId, 
            Integer.toString(parkingSpaceId), 
            Integer.toString(parkingLotId), 
            Double.toString(remainingAmount), 
            Double.toString(depositAmount), 
            startTime.getTime() + "", 
            endTime.getTime() + "", 
            licensePlate,
            status
        };
    }

    public static Booking deserialize(String[] data) {
        return new Booking(
            Integer.parseInt(data[0]), 
            data[1], 
            Integer.parseInt(data[2]), 
            Integer.parseInt(data[3]),
            Double.parseDouble(data[4]), 
            Double.parseDouble(data[5]), 
            new Date(Long.parseLong(data[6])), 
            new Date(Long.parseLong(data[7])), 
            data[8],
            data[9]);
    }
}
