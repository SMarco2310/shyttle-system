package com.ashesi.shuttle.model;

import jakarta.persistence.*;

@Entity
public class Booking {
    @Id
    private int bookingID;
//    @OneToOne(mappedBy = "bookings")
    private int customerID;
    private String customerName;
    private String bookingDate;
    private String bookingTime;
    @ManyToOne
    @JoinColumn(name = "notification_notification_id")
    private Notification notification;
    private String bookingLocation;
    private String bookingStatus;
    private String bookingType;

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }


    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getBookingID() {
        return bookingID;
    }
}
