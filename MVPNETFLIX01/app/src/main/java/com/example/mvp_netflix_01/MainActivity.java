package com.example.mvp_netflix_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mvp_netflix_01.view.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private static final int SCREEN = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        // SetTimeOut - setInterval
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent screenChanger = new Intent(
                        getBaseContext(),
                        LoginActivity.class
                );
                startActivity(screenChanger);
            }
        }, 4000);

    }
}