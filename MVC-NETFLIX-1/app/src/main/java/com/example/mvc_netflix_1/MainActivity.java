package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class MainActivity extends AppCompatActivity {
    private StudentController controller;
    private MainActivity view;
    private StudentWS model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CARGAR VIEW
        view = this;
        // CARGAR MODEL
        // MODEL + VIEW
        controller = new StudentController(model, view);
        // CASO DE USO-> OBTENER ESTUDIANTE
            controller.getStudent();
    }

    public void printStudentDetails(Student student){
        Log.d("MainActivity - NAME",student.getName());
        Log.d("MainActivity - NAME",student.getSurname());
    }

}