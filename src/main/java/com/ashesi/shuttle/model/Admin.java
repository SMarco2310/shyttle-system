package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

import java.util.Collection;

@Entity
@Table(name = "admins")
public class Admin extends User {

//    @JoinTable(name = "user_roles")
    private Collection<Role> roles = (Collection<Role>) new Role("ADMIN");

    public Admin( int id, String firstName, String lastName, String UserName,String email, String phoneNumber, String password) {
        super(id, firstName, lastName, UserName,  phoneNumber,email, password);
    }
    public Admin( String firstName, String lastName, String UserName,String email, String phoneNumber, String password) {
        super(firstName, lastName, UserName,  phoneNumber,email, password);
    }

    public Admin(int id, String UserName, String password) {
        super(id, UserName, password);
    }


    public Admin() {

    }
}
