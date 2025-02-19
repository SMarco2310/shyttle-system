package com.ashesi.shuttle.service;

import com.ashesi.shuttle.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final NotificationService notificationService;
    private final BookingService bookingService;
    private final UserService userService;

    public PaymentService(PaymentRepository paymentRepository, NotificationService notificationService, BookingService bookingService, UserService userService) {
        this.paymentRepository = paymentRepository;
        this.notificationService = notificationService;
        this.bookingService = bookingService;
        this.userService = userService;
    }

    public void deletePayment(Long paymentId) {
        paymentRepository.deleteById(paymentId);
    }

//    public void updatePayment(Long paymentId) {
//        // update payment
//        // send notification
//        // update booking
//        // update user
//    }


}
