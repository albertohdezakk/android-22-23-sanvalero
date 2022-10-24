package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //private static final int MEDIUM_TIME = 4000;

    // PROGRAMAMOS A TRAVÉS DE EVENTOS
    // QUE NOS NOTIFICA EL MÓVIL

    // SINGLETON-> ESTÁTICA
    private static MainActivity miInstancia = null;
    public static MainActivity getInstance(){
        return miInstancia;
    }
    /***************ON LOAD EN JAVASCRIPT*************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miInstancia = this;

        //ACTION_MAIN actionMain = new ACTION_MAIN(this);
        //0x457889

        //actionMain.desencadenaAlerta();
    }

    /**********************************************/

    /*EMPEZAR A PROGRAMAR*/
    /*public void desencadenaAlerta(){
        Toast.makeText(this,
                        "hello world!!!",
                    Toast.LENGTH_LONG).
                        show();
    }*/
}