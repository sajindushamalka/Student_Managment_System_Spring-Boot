package com.schoolManagementSystem.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolManagementSystem.demo.model.student;
import com.schoolManagementSystem.demo.repo.studentRepo;

@RestController
@CrossOrigin
public class studentController {

    @Autowired
    private studentRepo repo;

    @PostMapping("/students")
    public void createStudent(@RequestBody student s){
        repo.save(s);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable String id){
        repo.deleteById(id);
    }
    
    @GetMapping("/students")
    public List<student> findStudent(){
        return repo.findAll();
    }

    @GetMapping("/students/{id}")
    public student findOneStudent(@PathVariable String id){
       return  repo.findById(id).get();
    }

    @PutMapping("/students")
    public void updateTask(@RequestBody student s){
        
            //get the exsting document from DB
            student exitingstudent = repo.findById(s.getId()).get();
            
            exitingstudent.setFirstName(s.getFirstName());
            exitingstudent.setLastName(s.getLastName());
            exitingstudent.setAge(s.getAge());
            exitingstudent.setTeacher(s.getTeacher());
    
            repo.save(exitingstudent);
        
    }
}
