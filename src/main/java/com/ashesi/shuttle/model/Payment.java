package com.ashesi.shuttle.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Entity
@Table(name = "payments")
public class Payment {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming auto-increment is needed
    private Integer id;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(name = "payment_type", length = 20, nullable = false)
    private String paymentType = "MOMO";

    @Column(name = "payment_status", length = 20, nullable = false)
    private String paymentStatus = "PENDING";

    @Column(name = "payment_time", updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp paymentTime;

    // Constructors
    public Payment() {}

    public Payment(BigDecimal amount, String paymentType, String paymentStatus) {
        this.amount = amount;
        this.paymentType = paymentType;
        this.paymentStatus = paymentStatus;
    }

    public void  setPaymentid(Integer Paymentid) {
        this.id = Paymentid;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

}
