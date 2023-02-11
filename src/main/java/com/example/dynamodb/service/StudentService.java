package com.example.dynamodb.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.dynamodb.config.DynamoDbConfig;
import com.example.dynamodb.model.Student;
import com.example.dynamodb.model.StudentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final DynamoDBMapper dynamoDBMapper;

    public StudentService(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public StudentDTO createNewStudent(StudentDTO dto) {

        Student student = new Student();
        BeanUtils.copyProperties(dto, student);

        dynamoDBMapper.save(student);

        StudentDTO response = new StudentDTO();
        BeanUtils.copyProperties(student,response);

        return response;
    }
}