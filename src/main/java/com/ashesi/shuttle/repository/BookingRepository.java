package com.ashesi.shuttle.repository;


import com.ashesi.shuttle.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    Booking findByBookingId(int bookingId);

    Booking findByBookingDate(String bookingDate);

    Booking findByDriverID(int driverID);

    Booking findByCustomerID(int customerID);

    Booking findByLocationID(int locationID);

    Booking findBookingByCustomerID(int customerID);

    Booking findBookingByLocationID(int locationID);


    void deleteByBookingId(int bookingId);
    void deleteByCustomerID(int customerID);
    void deleteByLocationID(int locationID);
    void deleteByBookingDate(String bookingDate);
    void deleteByDriverID(int driverID);


    Booking save(Booking booking);
}
