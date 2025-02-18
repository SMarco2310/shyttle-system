package com.ashesi.shuttle.service;

import com.ashesi.shuttle.model.Admin;
import com.ashesi.shuttle.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> findAllAdmins() {
        return adminRepository.findAll();
    }

    public Optional<Admin> findAdminById(Integer id) {
        return adminRepository.findById(id);
    }

    public Optional<Admin> findAdminByName(String name) {
        return adminRepository.;
    }

    public void deleteAdminByName(String name) {
        Optional<Admin> admin = adminRepository.findByUserName(name);
        admin.ifPresent(adminRepository::delete);
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
            updatedAdmin.setPassword(password);
            adminRepository.save(updatedAdmin);
        }
    }

    public void addAdmin(String firstName, String lastName, String userName, String email, String phoneNumber, String password) {
        adminRepository.save(new Admin(firstName, lastName, userName, email, phoneNumber, password));
    }
}