package com.svalero.mvp_simpson_01.lst_simpson;

import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.Simpson;

import java.util.ArrayList;

public interface LstSimpsonContract {
    public interface View {
        void successLstSimpson(ArrayList<Simpson> lstSimpson);
        void failureLstSimpson(String error);

    }
    public interface Presenter{
        // CASO DE USO
        void lstSimpson(Simpson simpson);
    }
    public interface Model{
        interface OnLstSimpsonListener{
            void onSuccess(ArrayList<Simpson> lstSimpson);
            void onFailure(String error);
        }
        void lstSimpsonWS(Simpson simpson,
                          OnLstSimpsonListener onLstSimpsonListener);
    }
}
