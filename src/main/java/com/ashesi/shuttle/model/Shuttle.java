package com.ashesi.shuttle.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shuttles")
public class Shuttle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int maxCapacity;
    private int capacity;

    @OneToMany(mappedBy = "shuttle")
    private List<User> students = new ArrayList<>();

    @OneToOne
    private static Shuttle instance;

    public Shuttle() {

    }

    public static Shuttle getInstance() {
        if (instance == null) {
            instance = new Shuttle();
        }
        return instance;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addStudent(User student) {
        this.students.add(student);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}