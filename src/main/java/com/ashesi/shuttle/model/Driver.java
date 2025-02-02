package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;

@Entity
public class Driver extends User{

    public Driver(String role, int id, String firstName, String lastName, String email, String password, String phoneNumber) {
        super( role, id, firstName, lastName, email, password, phoneNumber);
    }
    public Driver(int id, String firstName, String password) {
        super(id, firstName, password);
    }

    public Driver() {

    }
}
