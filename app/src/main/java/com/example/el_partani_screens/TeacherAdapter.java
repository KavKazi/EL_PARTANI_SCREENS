package com.example.el_partani_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TeacherAdapter extends BaseAdapter {
    Context context;
    List<Teacher> objects;

    public TeacherAdapter(Context context, int resource, int textViewResourceld, List<Teacher> objects) {
       //super(context, resource,textViewResourceld,objects);
        this.context = context;
        this.objects = objects;

    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater =((Activity)context).getLayoutInflater();
        View view= layoutInflater.inflate(R.layout.activity_teacher_adapter,parent,false);
        TextView Tname= (TextView)view.findViewById(R.id.Tname);
        TextView Tclaas= (TextView)view.findViewById(R.id.Tclaas);
        ImageView Tavatar = (ImageView) view.findViewById(R.id.Tavatar);
        Teacher temp = objects.get(position);

        Tavatar.setImageBitmap(temp.getBitmap());
        Tname.setText(temp.getName());
        Tclaas.setText(temp.getClaas());
        return view;
    }
}
