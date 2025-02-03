package com.ashesi.shuttle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends User {
    public Student( int id, String firstName, String lastName, String email, String password, String phoneNumber) {
        super( id, firstName, lastName, email, password, phoneNumber, "USER");
    }
    public Student(int id, String firstName, String password) {
        super(id, firstName, password);
    }


    public Student() {

    }
}
