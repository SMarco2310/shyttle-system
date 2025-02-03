package com.ashesi.shuttle.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shuttles")
public class Shuttle {

    @Id
    private int id;

//    private String shuttleName;

    private int capacity;

    private String licensePlateNumber;

    private int driverID;


    public Shuttle(int id, int capacity, String licensePlateNumber, int driverID) {
        this.id = id;
//        this.shuttleName = shuttleName;
        this.capacity = capacity;
        this.licensePlateNumber = licensePlateNumber;
        this.driverID = driverID;
    }

    public Shuttle() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//    public String getShuttleName() {
//        return shuttleName;
//    }

//    public void setShuttleName(String shuttleName) {
//        this.shuttleName = shuttleName;
//    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }


    public int getDriverID() {
        return driverID;
    }
    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }
}
