package com.ashesi.shuttle.controller;

import com.ashesi.shuttle.dto.PaymentDTO;
import com.ashesi.shuttle.model.Payment;
import com.ashesi.shuttle.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/all")
    public List<Payment> getAllPayments() {
        return paymentService.findAllPayments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) {
        return paymentService.findPaymentById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<Payment> createPayment(@RequestBody PaymentDTO paymentDTO) {
        Payment payment = paymentService.createPayment(paymentDTO);
        return ResponseEntity.ok(payment);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Payment> updatePayment(@PathVariable Long id, @RequestBody PaymentDTO paymentDTO) {
        return paymentService.updatePayment(id, paymentDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        paymentService.deletePaymentById(id);
        return ResponseEntity.noContent().build();
    }
}