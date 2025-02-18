package com.ashesi.shuttle.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String paymentType = "MOMO";
    private String paymentStatus = "PENDING";
    private Timestamp paymentTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    // Constructors, getters/setters
    // Constructors
    public Payment() {}

    public Payment(double amount, String paymentType, String paymentStatus, User user, Booking booking) {
        this.amount = amount;
        this.paymentType = paymentType;
        this.paymentStatus = paymentStatus;
        this.user = user;
        this.booking = booking;
    }

    // Getters and Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}