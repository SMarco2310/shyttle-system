package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;

@Entity
public class Student extends User {
    public Student(String role, int id, String firstName, String lastName, String email, String password, String phoneNumber) {
        super(role, id, firstName, lastName, email, password, phoneNumber);
    }
    public Student(int id, String firstName, String password) {
        super(id, firstName, password);
    }


    public Student() {

    }
}
