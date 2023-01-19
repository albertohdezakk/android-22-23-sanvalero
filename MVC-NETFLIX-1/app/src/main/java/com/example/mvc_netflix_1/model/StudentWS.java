package com.example.mvc_netflix_1.model;

import com.example.mvc_netflix_1.model.pojo.Student;

public class StudentWS {
    private Student student;

    public Student getStudentWS(){
            student = new Student();
            student.setName("PEPE");
            student.setSurname("PALOTES");
                return student;
    }
    
}
