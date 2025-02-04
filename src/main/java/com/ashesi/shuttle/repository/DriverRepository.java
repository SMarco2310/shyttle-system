package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DriverRepository extends JpaRepository<Driver, Integer> {


    Driver findByEmail(String email);

    Driver findByFirstName(String firstName);

    Driver findByLastName(String lastName);

    Driver findById(int id);

    void deleteById(int id);

    void deleteByEmail(String email);

    void deleteByFirstName(String firstName);

    void deleteByLastName(String lastName);

    @Override
    void deleteAll();



    Driver save(Driver driver);

}
