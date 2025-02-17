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
    private Long locationID;
    private double price;

    private String LocationURL;


    public Location( Long locationID,String street, String city, String state, double price,String locationUrl) {
        this.locationID = locationID;
        this.street = street;
        this.city = city;
        this.state = state;
        this.price = price;
        this.LocationURL =locationUrl;
    }

    public Location() {

    }

    public Long getId() {
        return locationID;
    }
    public void setId(Long id) {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocationURL() {
        return LocationURL;
    }
    public void setLocationURL(String locationURL) {
        LocationURL = locationURL;
    }
}
