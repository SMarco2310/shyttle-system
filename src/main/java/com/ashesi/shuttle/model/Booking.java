package com.ashesi.shuttle.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    private int bookingID;
    @ManyToOne
    private Student student;
    private int LocationID;
    @JoinColumn(name = "notification_id")
    private int notificationID;
    private String bookingStatus;
    private Timestamp bookingDate;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getBookingID() {
        return bookingID;
    }
}
