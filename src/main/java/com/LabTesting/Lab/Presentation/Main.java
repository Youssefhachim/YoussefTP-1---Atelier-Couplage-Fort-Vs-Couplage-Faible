package com.LabTesting.Lab.Presentation;

import com.LabTesting.Lab.DAO.Student;
import com.LabTesting.Lab.DAO.StudentDAO;
import com.LabTesting.Lab.Service.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        StudentManager studentManager = new StudentManager(studentDAO);
        Student S= new Student("Hachim","Youssef");
        Student S1= new Student("first name1","last name1");
        Student S2= new Student("first name2","last name2");
        Student S3= new Student("first name3","last name3");
        Student S4= new Student("first name4","last name4");
        Student S5= new Student("first name5","last name5");
        Student S6= new Student("first name6","last name6");
        Student S7= new Student("first name7","last name7");

        Student student= new Student();

        student.setName("hachimmm");
        student.setPrenom("Yousssssef");
        student.setEmail("hachim.youssef10@gmail.com");

        System.out.println(student.toString());


        studentManager.addStudent(S);
        studentManager.addStudent(S1);
        studentManager.addStudent(S2);
        studentManager.addStudent(S3);
        studentManager.addStudent(S4);
        studentManager.addStudent(S5);
        studentManager.addStudent(S6);
        studentManager.addStudent(S7);

        System.out.println(studentManager.AllStudents());
    }
}
