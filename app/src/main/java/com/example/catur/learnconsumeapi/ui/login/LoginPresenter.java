package com.example.catur.learnconsumeapi.ui.login;

/**
 * Created by catur on 1/2/18.
 */

public class LoginPresenter {

    private LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
    }

    public void verify () {
       if (loginView.username().equals("abcd") && loginView.password().equals("1234")) {
           loginView.onLoginSuccess();
       } else {
           loginView.onLoginFailure();
       }
    }
}
