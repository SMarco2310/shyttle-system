package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

//    Payment findById(int id);

    Payment findByPaymentId(int paymentId);

    Payment findByCustomerId(int customerId);

    Payment findByPaymentDate(Timestamp paymentDate);

    Payment findByPaymentStatus(String paymentStatus);

    Payment findPaymentByPaymentType(String paymentType);


    Payment findByCustomerIdAndPaymentId(int customerId, int paymentId);

    void deleteByPaymentId(int paymentId);

    void deleteByCustomerId(int customerId);

    void deleteByPaymentIdAndCustomerId(int paymentId, int customerId);

    Payment save(Payment payment);





}
