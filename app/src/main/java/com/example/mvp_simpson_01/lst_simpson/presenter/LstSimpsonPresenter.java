package com.example.mvp_simpson_01.lst_simpson.presenter;

import com.example.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.example.mvp_simpson_01.lst_simpson.model.LstSimpsonModel;
import com.example.mvp_simpson_01.lst_simpson.model.pojo.Simpson;

import java.util.ArrayList;

public class LstSimpsonPresenter implements LstSimpsonContract.Presenter {
    private LstSimpsonModel lstSimpsonModel;

    public LstSimpsonPresenter(){
        lstSimpsonModel = new LstSimpsonModel();
    }
    @Override
    public void lstSimpson(Simpson simpson) {
        lstSimpsonModel.lstSimpsonWS(null, new LstSimpsonContract.Model.OnLstSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<Simpson> lstSimpson) {

            }

            @Override
            public void onFailure(String error) {

            }
        });
    }
}
