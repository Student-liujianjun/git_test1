package com.example.demo.service.serviceimpl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Cacheable(key = "#id",cacheNames = "student")
    public Student QueryById(int id) {
        System.out.println("....sql执行了.....");
        return studentMapper.QueryById(id);
    }

    @Override
    public List<Student> findAll() {

        return studentMapper.findAll();
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentMapper.deleteStudent(id);
    }

    @Override
    public void insertStudent(Student student) {
        studentMapper.insertStudent(student);
    }
}
