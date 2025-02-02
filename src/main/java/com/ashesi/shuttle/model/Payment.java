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

    public Payment(int payment_id, Date payment_date, String payment_type, String payment_status, double payment_amount, User user) {
        this.payment_id = payment_id;
        this.payment_date = payment_date;
        this.payment_type = payment_type;
        this.payment_status = payment_status;
        this.payment_amount = payment_amount;
        this.user = user;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public double getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(double payment_amount) {
        this.payment_amount = payment_amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment() {}
}
