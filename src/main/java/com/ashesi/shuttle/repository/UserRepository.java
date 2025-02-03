package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


    User findByUsername(String username);

    User findByID(int id);


}
