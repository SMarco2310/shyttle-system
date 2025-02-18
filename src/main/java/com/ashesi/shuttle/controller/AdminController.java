package com.ashesi.shuttle.controller;

import com.ashesi.shuttle.dto.AdminDTO;
import com.ashesi.shuttle.model.Admin;
import com.ashesi.shuttle.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return adminService.findAdminById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<Admin> createAdmin(@RequestBody AdminDTO adminDTO) {
        Admin admin = adminService.createAdmin(adminDTO);
        return ResponseEntity.ok(admin);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable Integer id, @RequestBody AdminDTO adminDTO) {
        return adminService.updateAdmin(id, adminDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable Integer id) {
        adminService.deleteAdminById(id);
        return ResponseEntity.noContent().build();
    }
}