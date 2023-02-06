package com.svalero.mvp_simpson_01.lst_simpson.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.svalero.mvp_simpson_01.R;
import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.Simpson;
import com.svalero.mvp_simpson_01.lst_simpson.presenter.LstSimpsonPresenter;

import java.util.ArrayList;

public class LstSimpsonActivity extends AppCompatActivity
           implements LstSimpsonContract.View {
    private LstSimpsonPresenter lstSimpsonPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponents();
        initPresenter();
        initData();

    }
    public void initComponents(){

    }
    public void initPresenter(){
        lstSimpsonPresenter = new LstSimpsonPresenter(this);
    }
    public void initData(){
        lstSimpsonPresenter.lstSimpson(null); //SELECT * FROM SIMPSON
    }


    @Override
    public void successLstSimpson(ArrayList<Simpson> lstSimpson) {
        // ADAPTER. NOTIFY SET DATA CHANGED
    }

    @Override
    public void failureLstSimpson(String error) {
        Toast.makeText(this, "Los datos no han podido " +
                "ser cargados", Toast.LENGTH_SHORT).show();
    }
}