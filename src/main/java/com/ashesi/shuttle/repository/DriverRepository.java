package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

    Optional<Driver> findByFirstName(String firstName);

    Optional<Driver> findByLastName(String lastName);

    Optional<Driver> findById(int id);

    void deleteById(int id);


    void deleteByFirstName(String firstName);

    void deleteByLastName(String lastName);
}