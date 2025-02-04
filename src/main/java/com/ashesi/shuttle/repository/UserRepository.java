package com.ashesi.shuttle.repository;

import com.ashesi.shuttle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


//    User findByUsername(String username);

    User findById(int id);

    User findByEmail(String email);

    User findByFirstName(String firstName);

    User findByLastName(String lastName);

    User findByFirstNameAndLastName(String firstName, String lastName);

    User findUserByFirstNameEquals(String firstName);

    User findUserByLastNameEquals(String lastName);

    void deleteByID(int id);

    void deleteByEmail(String email);

    void deleteByFirstName(String firstName);

    void deleteByLastName(String lastName);

    void deleteAll();

    User save(User user);


}
