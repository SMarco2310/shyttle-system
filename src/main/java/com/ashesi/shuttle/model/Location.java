package com.ashesi.shuttle.model;

import jakarta.persistence.*;


@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String state;
    private double price;
    private String locationUrl;

    // Constructors, getters/setters

    public Location( Long locationID,String street, String city, String state, double price,String locationUrl) {
        this.id = locationID;
        this.street = street;
        this.city = city;
        this.state = state;
        this.price = price;
        this.locationUrl =locationUrl;
    }

    public Location() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {

        this.id = id;
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
        return locationUrl;
    }
    public void setLocationURL(String locationURL) {
        locationUrl = locationURL;
    }
}
