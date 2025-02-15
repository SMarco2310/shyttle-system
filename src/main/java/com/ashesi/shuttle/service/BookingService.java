package com.ashesi.shuttle.service;


import com.ashesi.shuttle.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }




    public void deleteBooking(int bookingId) {
        bookingRepository.deleteById(bookingId);
    }

}
