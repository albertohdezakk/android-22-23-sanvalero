package com.svalero.netflixlogin.services;

import android.widget.Toast;

import com.svalero.netflixlogin.MainActivity;

public class ServiceUser {
    /* private MainActivity parent;
    public ServiceUser(MainActivity parent){
        this.parent = parent;
    }*/
    public void validarUser(String email, String password){
        if(!email.equals("") && email.length()>0 &&
                !password.equals("") && password.length()>0){
            Toast.makeText(MainActivity.getInstance(),
                    "Email y Password correctas ...",
                    Toast.LENGTH_LONG).show();
        }
}
}
