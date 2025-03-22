package com.parkingbookingsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingLot {

    private final int parkingLotId;
    private static int counter = 100;
    private String location;
    private boolean enabled;
    private ParkingSpace[] spaces;

    public ParkingLot(String location) {
        this.parkingLotId = ++counter;
        this.location = location;
        enabled = true;
        spaces = new ParkingSpace[100];
        for (int i = 0; i < spaces.length; i++) {
            spaces[i] = new ParkingSpace(i + 1, ParkingSpace.ParkingStatus.AVAILABLE, parkingLotId, new Sensor(i+1, i+1), "Location " + (i + 1));
        }
    }

    public ParkingLot(int parkingLotId, String location, boolean enabled) {
        if (counter < parkingLotId) {counter = parkingLotId;}
        this.parkingLotId = parkingLotId;
        this.location = location;
        this.enabled = enabled;
        spaces = new ParkingSpace[100];
        for (int i = 0; i < spaces.length; i++) {
            spaces[i] = new ParkingSpace(i + 1, ParkingSpace.ParkingStatus.AVAILABLE, parkingLotId, new Sensor(i+1, i+1), "Location " + (i + 1));
        }
    }

    public ParkingSpace[] getSpaces() {
        return spaces;
    }

    public void setSpaces(ParkingSpace[] spaces) {
        this.spaces = spaces;
    }

    public ParkingSpace getParkingSpaceById(int id) {
        for (ParkingSpace space : spaces) {
            if (space!= null && space.getParkingSpaceId() == id) {
                return space;
            }
        }
        return null;
    }

    public List<ParkingSpace> getAvailableParkingSpaceList() {
        List<ParkingSpace> availableSpaces = new ArrayList<>();
        for (ParkingSpace space : spaces) {
            if (space!= null && space.getStatus() == ParkingSpace.ParkingStatus.AVAILABLE) {
                availableSpaces.add(space);
            }
        }
        return availableSpaces;
    }

    public int getParkingLotId() {
        return this.parkingLotId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void enable() {
        this.enabled = true;
    }

    public void disable() {
        this.enabled = false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ParkingLot)) {
            return false;
        }
        ParkingLot parkingLot = (ParkingLot) o;
        return parkingLotId == parkingLot.parkingLotId && Objects.equals(location, parkingLot.location) && enabled == parkingLot.enabled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkingLotId, location, enabled);
    }

    @Override
    public String toString() {
        return "{" +
            " parkingId='" + getParkingLotId() + "'" +
            ", location='" + getLocation() + "'" +
            ", enabled='" + isEnabled() + "'" +
            "}";
    }

    public String[] serialize() {
        String[] serializedData = {String.valueOf(parkingLotId), location, String.valueOf(enabled)};
        return serializedData;
    }

    public static ParkingLot deserialize(String[] serializedData) {
        int parkingLotId = Integer.parseInt(serializedData[0]);
        String location = serializedData[1];
        boolean enabled = Boolean.parseBoolean(serializedData[2]);
        return new ParkingLot(parkingLotId, location, enabled);
    }
}
