package com.ashesi.shuttle.model;

import jakarta.persistence.*;
//import org.hibernate.annotations.Table;
import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "users")
public class User {


    private int id;
    private String firstName;
    private String lastName;
    private String UserName;
    private String email;
    private String password;
    private String phoneNumber;
    @OneToMany
    private List<Booking> HistoricalBookings;
    @OneToMany
    private List<Payment> HistoricalPayments;
//    @ManyToMany(fetch = FetchType.EAGER)

//    @JoinTable(
//            name = "users_roles",
//            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
//    private Collection<Role> roles;


    public User( int id, String firstName, String lastName, String UserName, String phoneNumber,String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.UserName = UserName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User( String firstName, String lastName, String UserName, String phoneNumber,String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.UserName = UserName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    public User(int id, String UserName, String password) {
        this.id = id;
        this.UserName= UserName;
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

    public String getUserName() {
        return UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
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




}
