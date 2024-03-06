package com.LabTesting.Lab.DAO;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements IStudent{
    List<Student> Students = new ArrayList<>();

    @Override
    public Student addStudent(Student student) {
        Students.add(student);
        return student;
    }
    @Override
    public Student getStudentByEmail(String email) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return Students;
    }
}
