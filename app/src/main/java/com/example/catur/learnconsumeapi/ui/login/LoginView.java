package com.example.catur.learnconsumeapi.ui.login;

/**
 * Created by catur on 1/2/18.
 */

public interface LoginView {

    void onLoginSuccess();

    void onLoginFailure();

    String username();

    String password();

}
