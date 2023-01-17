package com.svalero.netflixlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.svalero.netflixlogin.services.ServiceUser;

public class MainActivity extends AppCompatActivity {
    private static MainActivity parent;
    public static MainActivity getInstance(){
        return parent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ON-LOAD JAVASCRIPT
        initComponents();
        this.parent = this;
    }

    private EditText edtUser;
    private EditText edtPassword;
    private Button btnLogin;

    private void initComponents(){
        edtUser = (EditText)findViewById(R.id.edtUser);
        edtPassword = (EditText)findViewById(R.id.edtPassword);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtUser.getText().toString();
                String password = edtPassword.getText().toString();

                ServiceUser serviceUser = new ServiceUser(parent);
                serviceUser.validarUser(email, password);

                }
            }
        );
    }

}