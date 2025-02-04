package com.ashesi.shuttle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import org.hibernate.annotations.Table;
import java.util.List;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "users")
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    @OneToMany
    private List<Booking> HistoricalBookings;
    @OneToMany
    private List<Payment> HistoricalPayments;
    @Column(insertable = false, updatable = false) // Managed by DiscriminatorColumn

    private String role;


    public User( int id, String firstName, String lastName,  String phoneNumber,String email, String password,String role) {
        this.role = role;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(int id, String firstName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.password = password;
    }

    public User() {
    }

    @jakarta.persistence.Id
    @Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
