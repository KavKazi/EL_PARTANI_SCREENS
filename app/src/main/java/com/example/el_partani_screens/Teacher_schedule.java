package com.example.el_partani_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Teacher_schedule extends AppCompatActivity {

    ListView lsvts;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_schedule);

        lsvts = findViewById(R.id.lvTecherSchedule);

        ArrayList<Teacher_schedule_row> arr = new ArrayList<>();

        arr.add(new Teacher_schedule_row(R.drawable.teacherpic4,11,"יום ראשון שיעור רביעי:"));
        arr.add(new Teacher_schedule_row(R.drawable.teacherpic1,8,"יום שני שיעור ראשון:"));
        arr.add(new Teacher_schedule_row(R.drawable.teacherpic2,9,"יום שלישי שיעור שני :"));
        arr.add(new Teacher_schedule_row(R.drawable.teacherpic3,13,"יום שלישי שיעור שישי:"));
        arr.add(new Teacher_schedule_row(R.drawable.teacherpic5,15,"יום רביעי שיעור שמיני:"));
        arr.add(new Teacher_schedule_row(R.drawable.teacherpic6,10,"יום חמישי שיעור שלישי:"));


        Teacher_scheduleAdapter adapter = new Teacher_scheduleAdapter(this,0,arr);
        lsvts.setAdapter(adapter);
    }
}