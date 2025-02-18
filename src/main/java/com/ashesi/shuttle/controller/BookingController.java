package com.ashesi.shuttle.controller;

import com.ashesi.shuttle.dto.BookingDTO;
import com.ashesi.shuttle.model.Booking;
import com.ashesi.shuttle.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingService.findAllBookings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Integer id) {
        return bookingService.findBookingById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(@RequestBody BookingDTO bookingDTO) {
        Booking booking = bookingService.createBooking(bookingDTO);
        return ResponseEntity.ok(booking);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Booking> updateBooking(@PathVariable Integer id, @RequestBody BookingDTO bookingDTO) {
        return bookingService.updateBooking(id, bookingDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Integer id) {
        bookingService.deleteBookingById(id);
        return ResponseEntity.noContent().build();
    }
}