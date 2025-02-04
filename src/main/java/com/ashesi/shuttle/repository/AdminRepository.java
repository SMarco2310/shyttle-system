package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Optional<Admin> findByEmail(String email);

    Optional<Admin> findByPhoneNumber(String phoneNumber);

    List<Admin> findByFirstNameContainingIgnoreCase(String firstName);

    List<Admin> findByLastNameContainingIgnoreCase(String lastName);

    List<Admin> findByRole(String role);

    boolean existsByEmail(String email);

    boolean existsByPhoneNumber(String phoneNumber);

    void deleteByEmail(String email);

    void deleteByPhoneNumber(String phoneNumber);

    void deleteByRole(String role);

    void deleteByFirstName(String firstName);

    void deleteByLastName(String lastName);
}