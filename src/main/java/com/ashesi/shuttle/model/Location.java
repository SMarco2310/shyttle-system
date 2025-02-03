package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "locations")
public class Location {


    private String street;
    private String city;
    private String state;
    @Id
    private int locationID;


    public Location( int locationID,String street, String city, String state) {
        this.locationID = locationID;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Location() {

    }

    public int getId() {
        return locationID;
    }
    public void setId(int id) {

        this.locationID = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
