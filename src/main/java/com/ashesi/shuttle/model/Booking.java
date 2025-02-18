package com.ashesi.shuttle.model;
import  com.ashesi.shuttle.model.Location;
import com.ashesi.shuttle.util.utilClass;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingID;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    @NotNull(message = "User is required")
    private User student;

    @ManyToOne
//    @JoinColumn(name = "location_id", referencedColumnName = "id")
//    @NotNull(message = "Location is required")
    private Location location;

    @Column(name = "booking_date")
//    @NotNull(message = "Booking date is required")
    private LocalDateTime bookingDate;

//    @Column(name = "trip_date")
//    @NotNull(message = "Trip date is required")
    private LocalDate tripDate = utilClass.getNextFriday();

    @Column(name = "status")
    private String status; // e.g., "Pending", "Confirmed", "Cancelled"

//    @Column(name = "payment_status")
//    private String paymentStatus; // e.g., "Paid", "Unpaid"


    // Default constructor (required by JPA)
    public Booking() {}

    // Parameterized constructor
    public Booking(User student, Location location, LocalDateTime bookingDate, LocalDate tripDate, String status){ //String paymentStatus) {
        this.student = student;
        this.location = location;
        this.bookingDate = bookingDate;
        this.tripDate = tripDate;
        this.status = status;
//        this.paymentStatus = paymentStatus;
    }

    // Getters and Setters
    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getTripDate() {
        return tripDate;
    }

    public void setTripDate(LocalDate tripDate) {
        this.tripDate = tripDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public String getPaymentStatus() {
//        return paymentStatus;
//    }
//
//    public void setPaymentStatus(String paymentStatus) {
//        this.paymentStatus = paymentStatus;
//    }


    // Override toString(), equals(), and hashCode()...
}