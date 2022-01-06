package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface IStudentService {

    public List<Student> getStudents();
    public void addNewStudent(Student student);
    public void deleteStudent(Long studentId);
    public void updateStudent(Long studentId, String name, String email);

}
