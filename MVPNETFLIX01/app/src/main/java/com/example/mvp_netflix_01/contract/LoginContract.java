package com.example.mvp_netflix_01.contract;

import com.example.mvp_netflix_01.model.pojo.User;

public interface LoginContract {
    public interface View{
        void successLogin(User user, String message);
        void failureLogin(String err);
    }
    public interface Presenter{
        void login(User user);
    }
    public interface Model{
        interface OnLoginUserListener{
            void onSuccess(User user);
            void onFailure(String error);
        }
        void findUserWS(User user, OnLoginUserListener onLoginUserListener);
    }
}
