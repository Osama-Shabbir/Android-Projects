package com.example.osama.gitfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Osama on 10/13/2017.
 */

public class StudentAdapter extends ArrayAdapter <Student> {
    ArrayList<Student>students;

    public StudentAdapter(Context context,ArrayList<Student> students){
        super (context,0,students);
        this.students = students;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View view;

        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list2,parent,false);
        }
        else
            view = convertView;


        TextView tvname = (TextView)view.findViewById(R.id.tvname);
        TextView tvemail = (TextView)view.findViewById(R.id.tvemail);
        TextView tvnumber = (TextView)view.findViewById(R.id.tvnumber);

        Student student = students.get(position);
        tvname.setText(student.getName());
        tvemail.setText(student.getEmail());
        tvnumber.setText(student.getPhone());


        return  view;
    }

}
