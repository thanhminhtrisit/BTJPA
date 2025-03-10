package com.bum.baitapjpa.services;

import com.bum.baitapjpa.entity.Student;

import java.util.List;

public interface StudentServiceImp {
    List<Student> getAllStudents();
    List<Student> getStudentByName(String name);
    Student createStudent(Student student);
    void deleteStudent(int id);
}
