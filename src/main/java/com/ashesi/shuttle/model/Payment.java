package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Payment {

    @Id
    private int payment_id;
    private Date payment_date;
    private String payment_type;
    private String payment_status;
    private double payment_amount;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment() {}
}
