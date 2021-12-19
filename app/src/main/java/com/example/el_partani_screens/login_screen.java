package com.example.el_partani_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class login_screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        Button login_btn= findViewById(R.id.loginbtn);
        Button toSignUp_btn= findViewById(R.id.toSignUp_btn);
        //לשאול את רוני איך אני יודע על איזה כפתור לחצו .
        //if ()
          //  public void run() {
                Intent intent= new Intent(login_screen.this,Signup_screen.class );
                startActivity(intent);
                finish();
            }
        }
   // }
