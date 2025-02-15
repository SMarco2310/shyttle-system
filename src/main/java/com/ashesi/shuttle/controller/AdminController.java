package com.ashesi.shuttle.controller;

import com.ashesi.shuttle.model.Admin;
import com.ashesi.shuttle.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admins")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/all")
    public List<Admin> getAllAdmins() {
        return adminService.findAllAdmins();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Integer id) {
        Optional<Admin> admin = adminService.findAdminById(id);
        return admin.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping("/create")
    public void createAdmin(@RequestBody Admin admin) {
        adminService.addAdmin(admin.getFirstName(), admin.getLastName(), admin.getUserName(), admin.getEmail(), admin.getPhoneNumber(), admin.getPassword());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable Integer id, @RequestBody Admin adminDetails) {
        adminService.updateAdmin(id, adminDetails.getFirstName(), adminDetails.getLastName(), adminDetails.getUserName(), adminDetails.getEmail(), adminDetails.getPhoneNumber(), adminDetails.getPassword());
        return ResponseEntity.ok(adminDetails);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAdminById(@PathVariable Integer id) {
        adminService.deleteAdminById(id);
        return ResponseEntity.noContent().build();
    }

}