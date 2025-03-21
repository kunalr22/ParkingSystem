package com.parkingbookingsystem;
import java.util.Objects;

public class ParkingSpace {
    public enum ParkingStatus { OCCUPIED, AVAILABLE, RESERVED, OUT_OF_SERVICE }
    private int parkingSpaceId;
    private ParkingStatus status;
    private int parkingLotId;
    private Sensor sensor;
    private String location;

    public ParkingSpace(int parkingSpaceId, ParkingStatus status, int parkingLotId, Sensor sensor, String location) {
        this.parkingSpaceId = parkingSpaceId;
        this.status = status;
        this.parkingLotId = parkingLotId;
        this.sensor = sensor;
        this.location = location;
    }

    public int getParkingSpaceId() {
        return this.parkingSpaceId;
    }

    public void setParkingSpaceId(int parkingSpaceId) {
        this.parkingSpaceId = parkingSpaceId;
    }

    public ParkingStatus getStatus() {
        return this.status;
    }

    public void setStatus(ParkingStatus status) {
        this.status = status;
    }

    public int getParkingLotId() {
        return this.parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Sensor getSensor() {
        return this.sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ParkingSpace parkingSpaceId(int parkingSpaceId) {
        setParkingSpaceId(parkingSpaceId);
        return this;
    }

    public ParkingSpace status(ParkingStatus status) {
        setStatus(status);
        return this;
    }

    public ParkingSpace parkingLotId(int parkingLotId) {
        setParkingLotId(parkingLotId);
        return this;
    }

    public ParkingSpace sensor(Sensor sensor) {
        setSensor(sensor);
        return this;
    }

    public ParkingSpace location(String location) {
        setLocation(location);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ParkingSpace)) {
            return false;
        }
        ParkingSpace parkingSpace = (ParkingSpace) o;
        return parkingSpaceId == parkingSpace.parkingSpaceId && Objects.equals(status, parkingSpace.status) && parkingLotId == parkingSpace.parkingLotId && Objects.equals(sensor, parkingSpace.sensor) && Objects.equals(location, parkingSpace.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkingSpaceId, status, parkingLotId, sensor, location);
    }

    @Override
    public String toString() {
        return "{" +
            " parkingSpaceId='" + getParkingSpaceId() + "'" +
            ", status='" + getStatus() + "'" +
            ", parkingLotId='" + getParkingLotId() + "'" +
            ", sensor='" + getSensor() + "'" +
            ", location='" + getLocation() + "'" +
            "}";
    }

    public void enable() {
        setStatus(ParkingStatus.AVAILABLE);
    }

    public void disable() {
        setStatus(ParkingStatus.OUT_OF_SERVICE);
    }

    public String[] serialize() {
        return new String[] {
            String.valueOf(parkingSpaceId),
            status.name(),
            String.valueOf(parkingLotId),
            String.valueOf(sensor.getSensorId()),
            location
        };
    }

    public static ParkingSpace deserialize(String[] serializedData) {
        int parkingSpaceId = Integer.parseInt(serializedData[0]);
        ParkingStatus status = ParkingStatus.valueOf(serializedData[1]);
        int parkingLotId = Integer.parseInt(serializedData[2]);
        int sensorId = Integer.parseInt(serializedData[3]);
        String location = serializedData[4];
        Sensor sensor = new Sensor(sensorId, parkingSpaceId);
        return new ParkingSpace(parkingSpaceId, status, parkingLotId, sensor, location);
    }
}
