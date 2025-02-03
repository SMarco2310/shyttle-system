package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {


    User findByUsername(String username);

    User findByID(int id);

//    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);
}
