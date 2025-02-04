package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(int id);

    Optional<User> findByEmail(String email);

    Optional<User> findByFirstName(String firstName);

    Optional<User> findByLastName(String lastName);

    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);

    void deleteById(int id);

    void deleteByEmail(String email);

    void deleteByFirstName(String firstName);

    void deleteByLastName(String lastName);
}