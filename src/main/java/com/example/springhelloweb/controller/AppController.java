package com.example.springhelloweb.controller;

import com.example.springhelloweb.model.Student;
import com.example.springhelloweb.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping
    public Student getStudentById(int id) {
        return appService.getStudentById(id);
    }

    // add student
    @PostMapping
    public Student addStudent(Student student) {
        return appService.addStudent(student);
    }

    // update student
    @PostMapping
    public Student updateStudent(Student student) {
        return appService.updateStudent(student);
    }

    // delete student
    @PostMapping
    public void deleteStudent(int id) {
        appService.deleteStudent(id);
    }

}
