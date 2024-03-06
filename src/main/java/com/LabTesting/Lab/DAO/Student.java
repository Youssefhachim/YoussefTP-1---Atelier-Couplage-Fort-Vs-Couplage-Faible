package com.LabTesting.Lab.DAO;

public class Student {
    Long Id_user;
    String name;
    String prenom;
    String email;

    public Student(String name, String prenom) {
        this.name = name;
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Id_user=" + Id_user +
                ", name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public Student() {
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
