package com.example.catur.learnconsumeapi.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.catur.learnconsumeapi.R;
import com.example.catur.learnconsumeapi.ui.list.ListGalleryActivity;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter presenter;
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView ();
        initPresenter();
    }

    private void initView () {
        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.verify();
            }
        });
    }

    private void initPresenter() {
        presenter = new LoginPresenter(this);
        presenter.verify();
    }

    @Override
    public void onLoginSuccess() {
        startActivity(new Intent( LoginActivity.this, ListGalleryActivity.class));
        //save token header
        //Sharedpreference .edit.put("token", ":");
    }

    @Override
    public void onLoginFailure() {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String username() {
        return etUsername.getText().toString();
    }

    @Override
    public String password() {
        return etPassword.getText().toString();
    }
}
