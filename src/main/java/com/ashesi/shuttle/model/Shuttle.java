package com.ashesi.shuttle.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shuttle {

    @Id
    private int id;

    private String shuttleName;

    private int capacity;

    private String licensePlateNumber;


    public Shuttle(int id, String shuttleName, int capacity, String licensePlateNumber) {
        this.id = id;
        this.shuttleName = shuttleName;
        this.capacity = capacity;
        this.licensePlateNumber = licensePlateNumber;
    }

    public Shuttle() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getShuttleName() {
        return shuttleName;
    }

    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }

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


}
