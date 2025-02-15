package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    Optional<Booking> findByBookingID(int bookingId);

    Optional<Booking> findByBookingDate(Timestamp bookingDate);

//    Optional<Booking> findByLocationID(int locationID);

    Optional<Booking> findBookingByCustomerID(int customerID);

    void deleteByCustomerID(int customerID);

    void deleteByDriverID(int driverID);
}