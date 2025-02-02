package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {
    public Admin(String role, int id, String firstName, String lastName, String email, String password, String phoneNumber) {
        super( role, id, firstName, lastName, email, password, phoneNumber);
    }
    public Admin(int id, String firstName, String password) {
        super(id, firstName, password);
    }


    public Admin() {

    }
}
