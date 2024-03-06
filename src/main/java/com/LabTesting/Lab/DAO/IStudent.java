package com.LabTesting.Lab.DAO;

import java.util.List;

public interface IStudent {
    public Student addStudent(Student student);
    public Student getStudentByEmail(String email);
    public List<Student> getAllStudent();
}
