package com.LabTesting.Lab.Service;

import com.LabTesting.Lab.DAO.Student;

import java.util.List;

public interface IStudentManager {
    public Student addStudent(Student student);
    public List<Student> AllStudents();
}
