package com.ashesi.shuttle.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationID;
    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Relationship with User entity

    @ManyToOne
//   @JoinColumn(name = "booking_id")
    private Booking booking; // Relationship with Booking entity (nullable if not all notifications are booking-related)

    @ManyToOne
//    @JoinColumn(name = "payment_id")
    private Payment payment; // Relationship with Payment entity (nullable if not all notifications are payment-related)

    private String message;

    @Column(name = "sent_at")
    private LocalDateTime sentAt;

    // Default constructor (required by JPA)
    public Notification() {}

    // Parameterized constructor
    public Notification(String title, User user, Booking booking, Payment payment, String message, LocalDateTime sentAt) {
        this.title = title;
        this.user = user;
        this.booking = booking;
        this.payment = payment;
        this.message = message;
        this.sentAt = sentAt;
    }

    // Getters and Setters
    public Long getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(Long notificationID) {
        this.notificationID = notificationID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    // Override toString() for better logging and debugging
    @Override
    public String toString() {
        return "Notification{" +
                "notificationID=" + notificationID +
                ", title='" + title + '\'' +
                ", user=" + user +
                ", booking=" + booking +
                ", payment=" + payment +
                ", message='" + message + '\'' +
                ", sentAt=" + sentAt +
                '}';
    }
}