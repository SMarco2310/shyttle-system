package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(int id);

    Optional<User> findByUserName(String userName);

    void deleteById(int id);

    void deleteByEmail(String email);

    void deleteByFirstName(String firstName);

    void deleteByLastName(String lastName);
}