package com.ashesi.shuttle.controller;

import com.ashesi.shuttle.dto.NotificationDTO;
import com.ashesi.shuttle.model.Notification;
import com.ashesi.shuttle.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/all")
    public List<Notification> getAllNotifications() {
        return notificationService.findAllNotifications();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> getNotificationById(@PathVariable Long id) {
        return notificationService.findNotificationById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<Notification> createNotification(@RequestBody NotificationDTO notificationDTO) {
        Notification notification = notificationService.createNotification(notificationDTO);
        return ResponseEntity.ok(notification);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Notification> updateNotification(@PathVariable Long id, @RequestBody NotificationDTO notificationDTO) {
        return notificationService.updateNotification(id, notificationDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotificationById(id);
        return ResponseEntity.noContent().build();
    }
}