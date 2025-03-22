package com.parkingbookingsystem;

public class Sensor {
    private int sensorId, parkingSpaceId;
    private boolean carDetected;

    public Sensor(int sensorId, int parkingSpaceId) {
        this.sensorId = sensorId;
        this.parkingSpaceId = parkingSpaceId;
        this.carDetected = false;
    }

    public int getSensorId() {
        return sensorId;
    }
    public int getParkingSpaceId() {
        return parkingSpaceId;
    }
    public boolean isCarDetected() {
        return carDetected;
    }

    public String sendInfoToSystem() {
        return "Sensor ID: " + sensorId + ", Parking Space ID: " + parkingSpaceId + ", Car Detected: " + carDetected;
    }

    public void setCarDetected(boolean carDetected) {
        this.carDetected = carDetected;
    }
    
    public String scanCarInfo() {
        return null;
    }
}
