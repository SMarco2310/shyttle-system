package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

    // Find an admin by email
    Optional<Admin> findByEmail(String email);

    // Find an admin by phone number
    Optional<Admin> findByPhoneNumber(String phoneNumber);

    // Find admins by first name
    List<Admin> findByFirstNameContainingIgnoreCase(String firstName);

    // Find admins by last name
    List<Admin> findByLastNameContainingIgnoreCase(String lastName);

    // Find all admins with a specific role (in case of role-based filters)
    List<Admin> findByRole(String role);

    // Check if an email already exists in the system
    boolean existsByEmail(String email);

    // Check if a phone number already exists in the system
    boolean existsByPhoneNumber(String phoneNumber);

    Admin deleteAdminsByEmail(String email);

    Admin deleteAdminsByPhoneNumber(String phoneNumber);
    Admin deleteAdminsByRole(String role);
    Admin deleteAdminsByFirstName(String firstName);
    Admin deleteAdminsByLastName(String lastName);


}
