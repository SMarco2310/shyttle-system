package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

//    Payment findById(int id);

    List<Payment> findByPaymentType(String paymentType);

    Payment findByPaymentTime(Timestamp paymentTime);

    Payment findByPaymentStatus(String paymentStatus);

    Payment findPaymentByPaymentType(String paymentType);


//    Payment findByCustomerIdAndPaymentId(int customerId, int paymentId);

    void deleteById(int paymentId);
//
//    void deleteByCustomerId(int customerId);
//
////    void deleteByPaymentIdAndCustomerId(int paymentId, int customerId);
//
//    Payment save(Payment payment);





}
