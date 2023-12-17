package com.example.springhelloweb.controller;

import com.example.springhelloweb.model.Student;
import com.example.springhelloweb.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

    // ...

    @org.springframework.web.bind.annotation.RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    // get all students from Appservice
    @org.springframework.web.bind.annotation.RequestMapping("/students")
    public List<Student> getStudents() {
        return appService.getAllStudents();
    }

    // get student by id from Appservice
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable(value = "id") Integer id) {
        return appService.getStudentById(id);
    }

    // add student
    @PostMapping(value = "/students")
    public Student addStudent(Student student) {
        return appService.addStudent(student);
    }

    // update student
    @PutMapping(value = "/students")
    public Student updateStudent(Student student) {
        return appService.updateStudent(student);
    }

    // delete student
    @DeleteMapping(value = "/students/{id}")
    public void deleteStudent(@PathVariable(value = "id") Integer id) {
        appService.deleteStudent(id);
    }

}
