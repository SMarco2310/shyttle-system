package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Notification findByNotificationID(Long notificationID);
    Notification findByUserID(int userID);
    Notification findByRideID(int rideID);
    void deleteByNotificationID(int notificationID);
    void deleteByUserID(int userID);
    void deleteByRideID(int rideID);
}