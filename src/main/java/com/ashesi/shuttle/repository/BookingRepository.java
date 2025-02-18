package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Booking;
import com.ashesi.shuttle.model.Location;
import com.ashesi.shuttle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByBookingID(Long bookingID);
    Booking findByStudent(User user);
    Booking findByLocation(Location location);
    void deleteByBookingID(int bookingID);
    void deleteByUserID(int userID);
    void deleteByRideID(int rideID);
}