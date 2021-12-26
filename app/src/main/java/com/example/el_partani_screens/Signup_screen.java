package com.example.el_partani_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class Signup_screen extends AppCompatActivity implements View.OnClickListener {
    Button sign_up_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

        sign_up_btn = findViewById(R.id.signupbtn);
        sign_up_btn.setOnClickListener(this);

}

    @Override
    public void onClick(View v) {
        if ((v == sign_up_btn)) {
            Intent intent = new Intent(Signup_screen.this, Profession_screen.class);
            startActivity(intent);
        }
    }
    }