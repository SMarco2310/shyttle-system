package com.ashesi.shuttle.model;

import jakarta.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;


@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;

    @OneToMany(mappedBy = "user")
    private List<Booking> historicalBookings;

    @OneToMany(mappedBy = "user")
    private List<Payment> historicalPayments;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private List<Role> roles;

    // Constructors, getters/setters

    public User(int id, String firstName, String lastName, String userName, String phoneNumber, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(String firstName, String lastName, String userName, String phoneNumber, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String UserName) {
        this.userName = UserName;
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


    public Collection<? extends GrantedAuthority> getAuthorities() {
            return roles.stream()
                        .map(role -> (GrantedAuthority) role::getName)
                        .collect(Collectors.toList());
    }
}

