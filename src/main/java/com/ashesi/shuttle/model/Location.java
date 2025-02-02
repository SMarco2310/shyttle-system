package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {


    private String street;
    private String city;
    private String state;
    @Id
    private int id;


    public Location(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Location() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {

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
}
