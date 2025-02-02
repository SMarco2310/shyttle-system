package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {
    @Id
    private int bookingID;
//    @OneToOne(mappedBy = "bookings")
    private int customerID;
    private String customerName;
    private String bookingDate;
    private String bookingTime;
    private String bookingLocation;
    private String bookingStatus;
    private String bookingType;


    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getBookingID() {
        return bookingID;
    }
}
