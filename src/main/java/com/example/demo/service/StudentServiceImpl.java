package com.example.demo.service;

import com.example.demo.models.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        System.out.println(student);
        Student student1 = null;
        try {
            student1 = studentRepo.save(student);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return student1;
    }
}
