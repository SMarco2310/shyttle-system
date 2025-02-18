package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findById(Long paymentID);
    Optional<Payment> findByPaymentTime(Timestamp paymentTime);
    Optional<Payment> findByPaymentStatus(String paymentStatus);
    void deleteByPaymentID(int paymentID);
    void deleteByUserID(int userID);
    void deleteByRideID(int rideID);
}