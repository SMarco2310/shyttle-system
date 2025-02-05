package com.ashesi.shuttle.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    private int bookingID;
//    @OneToOne(mappedBy = "bookings")
    private int customerID;
    private int driverID;
    private int LocationID;
    @JoinColumn(name = "notification_id")
    private int notificationID;
    private String bookingStatus;
    private String bookingType;
    private Timestamp bookingDate;




    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getBookingID() {
        return bookingID;
    }
}
