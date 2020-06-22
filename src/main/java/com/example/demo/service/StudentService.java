package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;


public interface StudentService {
    Student QueryById(int id);

    List<Student> findAll();

    void updateStudent(Student student);

    void deleteStudent(int id);

    void insertStudent(Student student);

}
