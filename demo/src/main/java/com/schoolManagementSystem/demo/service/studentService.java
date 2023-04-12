package com.schoolManagementSystem.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolManagementSystem.demo.model.student;
import com.schoolManagementSystem.demo.repo.studentRepo;

@Service
public class studentService {

    @Autowired
    private studentRepo studentrepo;

    public List<student> findAllStudent(){
        return studentrepo.findAll();
    }

    
}
