package com.svalero.mvp_simpson_01.lst_simpson.model;

import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.Simpson;

public class LstSimpsonModel implements LstSimpsonContract.Model {

    @Override
    public void lstSimpsonWS(Simpson simpson,
                             OnLstSimpsonListener onLstSimpsonListener) {
        //Si ha ido bien !!!!!!!!!!!
        onLstSimpsonListener.onSuccess(null);
        //Si ha ido mal !!!!!!!!!!!
        onLstSimpsonListener.onFailure("ERRRRRORRRRRR!!!!!!!!!!!!");
    }
}
