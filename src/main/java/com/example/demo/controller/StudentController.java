package com.example.demo.controller;

import com.example.demo.models.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping()
    public ResponseEntity<?> saveStudent(@RequestBody()Student student) {
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);
    }

}
