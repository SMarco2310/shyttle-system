package com.ashesi.shuttle.controller;

import com.ashesi.shuttle.exception.UserNotFoundException;
import com.ashesi.shuttle.model.User;
import com.ashesi.shuttle.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        Optional<User> user = userService.findUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User userDetails) {
        Optional<User> user = userService.findUserById(id);
        if (user.isPresent()) {
            User updatedUser = user.get();
            updatedUser.setFirstName(userDetails.getFirstName());
            updatedUser.setLastName(userDetails.getLastName());
            updatedUser.setEmail(userDetails.getEmail());
            updatedUser.setPhoneNumber(userDetails.getPhoneNumber());
            userService.saveUser(updatedUser);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) throws UserNotFoundException {
        if (userService.existsById(id)) {
            userService.deleteUserById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}