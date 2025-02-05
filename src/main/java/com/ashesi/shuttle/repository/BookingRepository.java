package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

//    Optional<Booking> findByBookingId(int bookingId);

    Optional<Booking> findByBookingDate(String bookingDate);

    Optional<Booking> findByDriverID(int driverID);

    Optional<Booking> findByCustomerID(int customerID);

//    Optional<Booking> findByLocationID(int locationID);

    Optional<Booking> findBookingByCustomerID(int customerID);

//    Optional<Booking> findBookingByLocationID(int locationID);

    void deleteByBookingId(int bookingId);

    void deleteByCustomerID(int customerID);

    void deleteByLocationID(int locationID);

//    void deleteByBookingDate(String bookingDate);

    void deleteByDriverID(int driverID);
}