package com.ashesi.shuttle.service;

import com.ashesi.shuttle.dto.UserDTO;
import com.ashesi.shuttle.exception.UserNotFoundException;
import com.ashesi.shuttle.model.User;
import com.ashesi.shuttle.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }



    @PreAuthorize("hasRole('ADMIN')") // Only admins can delete users
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')") // Admins and users can view users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Integer id) {
        return userRepository.findById(id);
    }


    public User Signup(UserDTO userDto) {
        User user = new User();
        return getUser(userDto, user);
    }

    private User getUser(UserDTO userDto, User user) {
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        return userRepository.save(user);
    }


    public User updateUser(Integer id, UserDTO userDto) throws UserNotFoundException {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User updatedUser = user.get();
            return getUser(userDto, updatedUser);
        }
        throw new UserNotFoundException("User not found with id: " + id);
    }

    public void deleteUserById(Integer id) throws UserNotFoundException {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }

    public boolean existsById(Integer id) {
        return userRepository.existsById(id);
    }
}