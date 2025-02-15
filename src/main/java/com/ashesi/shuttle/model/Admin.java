package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "admins")
public class Admin extends User {
    public Admin( int id, String firstName, String lastName, String UserName,String email, String phoneNumber, String password) {
        super(id, firstName, lastName, UserName,  phoneNumber,email, password,"ADMIN");
    }
    public Admin( String firstName, String lastName, String UserName,String email, String phoneNumber, String password) {
        super(firstName, lastName, UserName,  phoneNumber,email, password,"ADMIN");
    }

    public Admin(int id, String UserName, String password) {
        super(id, UserName, password);
    }


    public Admin() {

    }
}
