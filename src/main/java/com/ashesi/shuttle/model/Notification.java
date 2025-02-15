package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    private int notificationID;
    private String title;
    private int userID;
    private String UserName;
    private int rideID;
    private String message;
    private Timestamp sentAt;

    public Notification(int notificationID, String title, int userID, int rideID, String message, Timestamp sentAt,String UserName) {
        this.notificationID = notificationID;
        this.title = title;
        this.userID = userID;
        this.rideID = rideID;
        this.message = message;
        this.sentAt = sentAt;
        this.UserName = UserName;
    }

    public Notification() {

    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public int getRideID() {
        return rideID;
    }

    public void setRideID(int rideID) {
        this.rideID = rideID;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
