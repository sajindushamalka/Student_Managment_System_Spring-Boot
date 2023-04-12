package com.schoolManagementSystem.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.schoolManagementSystem.demo.model.student;

@Repository
public interface studentRepo extends MongoRepository<student,String>{
    
}
