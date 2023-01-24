package com.example.mvp_netflix_01.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvp_netflix_01.R;

public class LoginActivity extends AppCompatActivity {
    private EditText edtUserLogin;
    private EditText edtPasswordLogin;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
        initPresenter();
    }
    private void initComponents(){
        edtUserLogin = findViewById(R.id.edtUserLogin);
        edtPasswordLogin = findViewById(R.id.edtPasswordLogin);
        btnLogin = findViewById(R.id.btnLogin);
    }
    private void initPresenter(){

    }
}