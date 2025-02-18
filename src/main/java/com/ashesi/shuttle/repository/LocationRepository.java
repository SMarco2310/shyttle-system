package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LocationRepository extends JpaRepository<Location, Integer> {

    Optional<Location> findById(int id);

    Optional<Location> findByCity(String City);

    Optional<Location> findByCityAndStreet(String City, String Street);

    List<Location> findByPrice(double price);

    void deleteById(int id);

    void deleteByLocationName(String locationName);

    void deleteByLocationType(String locationType);
}
