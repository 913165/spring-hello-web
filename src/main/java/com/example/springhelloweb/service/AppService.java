package com.example.springhelloweb.service;

import com.example.springhelloweb.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppService {
    // static arraylist for student data with five records

    private static List<Student> students = new ArrayList<>();

    // static block to populate the student data with firstname , lastname , country and favourite language with five records
    static {
        students.add(new Student("John", "Doe", "United States", "Java"));
        students.add(new Student("Jane", "Smith", "United Kingdom", "Python"));
        students.add(new Student("Tom", "Brown", "Canada", "JavaScript"));
        students.add(new Student("Mary", "Johnson", "Australia", "C++"));
        students.add(new Student("Peter", "White", "New Zealand", "Ruby"));
    }

    // method to get all the students
    public List<Student> getAllStudents() {
        return students;
    }

    // get student by id
    public Student getStudentById(int id) {
        return students.get(id);
    }

    // method to add a student
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    // method to delete a student
    public void deleteStudent(int student) {
        students.remove(student);
    }

    // method to update a student
    public Student updateStudent(Student student) {
        students.remove(student);
        students.add(student);
        return student;
    }
}
