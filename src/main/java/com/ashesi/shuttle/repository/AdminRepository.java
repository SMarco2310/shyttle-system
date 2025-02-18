package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findById(int Id);
    Admin findByEmail(String email);
    Admin findByFirstName(String firstName);
    Admin findByLastName(String lastName);
    Admin findByFirstNameAndLastName(String firstName, String lastName);
    void deleteByAdminID(int adminID);
    void deleteByEmail(String email);
    void deleteByFirstName(String firstName);
    void deleteByLastName(String lastName);
}