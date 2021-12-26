package com.example.el_partani_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class login_screen extends AppCompatActivity implements View.OnClickListener {
    Button login_btn, toSignUp_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        Button login_btn = findViewById(R.id.loginbtn);
        Button toSignUp_btn = findViewById(R.id.toSignUp_btn);
        login_btn.setOnClickListener(this);
        toSignUp_btn.setOnClickListener(this);
    }

        @Override
        public void onClick (View v){
            if ((v == login_btn)) {
                Intent intent = new Intent(login_screen.this, Profession_screen.class);
                startActivity(intent);
            }
            if ((v == toSignUp_btn)) {
                Intent intent = new Intent(login_screen.this, Signup_screen.class);
                startActivity(intent);
            }
        }
        }


