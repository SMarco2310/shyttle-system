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

    @Column(nullable = false)
    private double amount;

    @Column(name = "payment_type", length = 20, nullable = false)
    private String paymentType = "MOMO";

    @Column(name = "payment_status", length = 20, nullable = false)
    private String paymentStatus = "PENDING";

    @Column(name = "payment_time", updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp paymentTime;

    // Relationship with User
    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Relationship with Booking
    @OneToOne
//    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

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