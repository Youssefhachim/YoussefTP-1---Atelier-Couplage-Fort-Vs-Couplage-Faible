package com.LabTesting.Lab.Service;

import com.LabTesting.Lab.DAO.IStudent;
import com.LabTesting.Lab.DAO.Student;
import com.LabTesting.Lab.DAO.StudentDAO;

import java.util.List;

public class StudentManager implements IStudentManager{
    IStudent studentInterface;

    public StudentManager(IStudent studentInterface) {
        this.studentInterface = studentInterface;
    }

    @Override
    public Student addStudent(Student student) {
        if(studentInterface.getStudentByEmail(student.getEmail())==null){
            return studentInterface.addStudent(student);
        }
        return null;
    }

    @Override
    public List<Student> AllStudents() {
        return studentInterface.getAllStudent();
    }

}
