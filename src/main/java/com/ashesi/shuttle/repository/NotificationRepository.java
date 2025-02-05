package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

    Optional<Notification> findByTitle(String title);

    Optional<Notification> findByNotificationID(int notificationID);

    Optional<Notification> findByUserID(int userID);

    Optional<Notification> findByRideID(int rideID);

    void deleteByNotificationID(int notificationID);

    void deleteByTitle(String title);
}