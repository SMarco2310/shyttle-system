package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "admins")
public class Admin extends User {
    public Admin( int id, String firstName, String lastName, String email, String phoneNumber, String password) {
        super(id, firstName, lastName,  phoneNumber,email, password,"ADMIN");
    }
    public Admin(int id, String firstName, String password) {
        super(id, firstName, password);
    }


    public Admin() {

    }
}
