package com.ashesi.shuttle.service;

import com.ashesi.shuttle.dto.UserDTO;
import com.ashesi.shuttle.model.Admin;
import com.ashesi.shuttle.repository.AdminRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;
    private final PasswordEncoder passwordEncoder;

    public AdminService(AdminRepository adminRepository, PasswordEncoder passwordEncoder) {
        this.adminRepository = adminRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<Admin> findAllAdmins() {
        return adminRepository.findAll();
    }

    public Optional<Admin> findAdminById(Integer id) {
        return adminRepository.findById(id);
    }

    public Admin SignUpAdmin(UserDTO userDTO) {
        String firstName = userDTO.getFirstName();
        String lastName = userDTO.getLastName();
        String userName = userDTO.getUserName();
        String email = userDTO.getEmail();
        String phoneNumber = userDTO.getPhoneNumber();
        String password = userDTO.getPassword();

        return adminRepository.save(new Admin(firstName, lastName, userName, email, phoneNumber, password));
    }


    public void deleteAdminById(Integer id) {
        adminRepository.deleteById(id);
    }

    public void updateAdmin(Integer id, String firstName, String lastName, String userName, String email, String phoneNumber, String password) {
        Optional<Admin> admin = adminRepository.findById(id);
        if (admin.isPresent()) {
            Admin updatedAdmin = admin.get();
            updatedAdmin.setFirstName(firstName);
            updatedAdmin.setLastName(lastName);
            updatedAdmin.setUserName(userName);
            updatedAdmin.setEmail(email);
            updatedAdmin.setPhoneNumber(phoneNumber);
            updatedAdmin.setPassword( passwordEncoder.encode(password));
            adminRepository.save(updatedAdmin);
        }
    }



    public void addAdmin(String firstName, String lastName, String userName, String email, String phoneNumber, String password) {
        adminRepository.save(new Admin(firstName, lastName, userName, email, phoneNumber, password));
    }
}