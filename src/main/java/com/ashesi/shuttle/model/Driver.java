package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "drivers")
public class Driver extends User{

    public Driver(int id, String firstName, String lastName, String email,String phoneNumber,String password) {
        super(id, firstName, lastName, email, password, phoneNumber,"Driver");
    }
    public Driver(int id, String firstName, String password) {
        super(id, firstName, password);
    }

    public Driver() {

    }

}
