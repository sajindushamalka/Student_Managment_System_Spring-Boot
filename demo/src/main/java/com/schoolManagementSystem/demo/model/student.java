package com.schoolManagementSystem.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "student")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class student {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String teacher;
    private int age;
    
}
