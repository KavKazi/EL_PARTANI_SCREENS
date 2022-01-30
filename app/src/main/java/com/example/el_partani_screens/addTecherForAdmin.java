package com.example.el_partani_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addTecherForAdmin extends AppCompatActivity implements View.OnClickListener {
    private Button btn_saveNewTecher;
    EditText ETnewTecherName,ETnewTecherClass,ETnewTecherAvatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_techer_for_admin);

        ETnewTecherName = findViewById(R.id.ETnewTecherName);
        ETnewTecherClass = findViewById(R.id.ETnewTecherClass);
        ETnewTecherAvatar = findViewById(R.id.ETnewTecherAvatar);
        btn_saveNewTecher = findViewById(R.id.btn_saveNewTecher);
        btn_saveNewTecher.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
            Intent intent = new Intent(addTecherForAdmin.this, Profession_screen.class);
            startActivity(intent);
        }
}