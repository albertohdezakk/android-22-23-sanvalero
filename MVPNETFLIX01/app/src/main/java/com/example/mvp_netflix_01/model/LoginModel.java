package com.example.mvp_netflix_01.model;

import com.example.mvp_netflix_01.contract.LoginContract;
import com.example.mvp_netflix_01.model.pojo.User;

public class LoginModel implements LoginContract.Model {
    @Override
    public void findUserWS(User user,
                            OnLoginUserListener onLoginUserListener) {

    }

}
