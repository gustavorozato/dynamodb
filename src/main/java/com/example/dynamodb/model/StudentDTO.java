package com.example.dynamodb.model;

import lombok.Data;

@Data
public class StudentDTO {
    private Long studentId;
    private String firstName;
    private String lastName;
}
