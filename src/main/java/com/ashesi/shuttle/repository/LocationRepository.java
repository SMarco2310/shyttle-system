package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    Optional<Location> findByLocationID(int locationID);
//    List<Location> findByLocationName(String locationName);
//    void deleteByLocationID(int locationID);
//    void deleteByLocationName(String locationName);
}
