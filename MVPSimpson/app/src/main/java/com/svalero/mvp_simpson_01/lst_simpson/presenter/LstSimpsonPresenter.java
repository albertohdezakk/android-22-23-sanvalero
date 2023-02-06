package com.svalero.mvp_simpson_01.lst_simpson.presenter;

import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lst_simpson.model.LstSimpsonModel;
import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.Simpson;

import java.util.ArrayList;

public class LstSimpsonPresenter implements LstSimpsonContract.Presenter {
    private LstSimpsonModel lstSimpsonModel;
    private LstSimpsonContract.View view;
    public LstSimpsonPresenter(LstSimpsonContract.View view){
        this.view = view;
        lstSimpsonModel = new LstSimpsonModel();
    }
    @Override
    public void lstSimpson(Simpson simpson) {
        lstSimpsonModel.lstSimpsonWS(null, new LstSimpsonContract.Model.OnLstSimpsonListener(){

            @Override
            public void onSuccess(ArrayList<Simpson> lstSimpson) {
                view.successLstSimpson(lstSimpson);
            }

            @Override
            public void onFailure(String error) {
                view.failureLstSimpson(error);
            }
        });
    }
}
