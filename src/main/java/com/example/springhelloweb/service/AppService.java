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
        students.add(new Student(1,"John", "Doe", "United States", "Java"));
        students.add(new Student(2,"Jane", "Smith", "United Kingdom", "Python"));
        students.add(new Student(3,"Tom", "Brown", "Canada", "JavaScript"));
        students.add(new Student(4,"Mary", "Johnson", "Australia", "C++"));
        students.add(new Student(5,"Peter", "White", "New Zealand", "Ruby"));
    }

    // method to get all the students
    public List<Student> getAllStudents() {
        return students;
    }

    // get student by id
    public Student getStudentById(Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // method to add a student
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    // method to delete a student
    public void deleteStudent(Integer student) {
        for (Student s : students) {
            if (s.getId() == student) {
                students.remove(s);
                break;
            }
        }
    }

    // method to update a student
    public Student updateStudent(Student student) {
        students.remove(student);
        students.add(student);
        return student;
    }
}
