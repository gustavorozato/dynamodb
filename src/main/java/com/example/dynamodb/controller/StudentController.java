package com.example.dynamodb.controller;

import com.example.dynamodb.model.StudentDTO;
import com.example.dynamodb.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/")
    public StudentDTO createNewStudent(@RequestBody StudentDTO dto){
        return studentService.createNewStudent(dto);
    }
}
