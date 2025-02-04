package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface NotificationRepository extends JpaRepository<Notification, Integer> {


    Notification findByTitle(String title);

//    Notification findByMessage(String message);


    Notification findByNotificationID(int notificationID);


    Notification findByTitleAndNotificationID(String title, int notificationID);


    void deleteByNotificationID(int notificationID);

    void deleteByTitle(String title);

    void deleteAll();


    Notification save(Notification notification);


}
