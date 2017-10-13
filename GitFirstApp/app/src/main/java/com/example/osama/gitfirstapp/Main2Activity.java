package com.example.osama.gitfirstapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    /*public static final String MyPreference = "MyPref";
    public static final String Name = "MyName";
    public static final String Email= "MyEmail";
    public static final String Phone = "MyPhone";
    SharedPreferences sharedPreferences;*/

    ArrayList <Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = (ListView)findViewById(R.id.myListView);
        students = new ArrayList<>();

        final StudentAdapter studentAdapter = new StudentAdapter(this,students);

        final EditText etname = (EditText)findViewById(R.id.etName);
        final EditText etemail = (EditText)findViewById(R.id.etEmail);
        final EditText etnumber = (EditText) findViewById(R.id.etNumber);

        Button addbtn = (Button)findViewById(R.id.addbtn);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etNameStr = etname.getText().toString();
                String etEmailStr = etemail.getText().toString();
                String etNumberStr = etnumber.getText().toString();

                Student student = new Student(etNameStr,etEmailStr,etNumberStr);
                students.add(student);
                studentAdapter.notifyDataSetChanged();
            }
        });

        listView.setAdapter(studentAdapter);

       /* final EditText editTextName = (EditText)findViewById(R.id.etName);
        final EditText editTextEmail = (EditText)findViewById(R.id.etEmail);
        final EditText editTextPhone = (EditText)findViewById(R.id.etNumber);

        Button button = (Button)findViewById(R.id.addbtn);

        sharedPreferences = getSharedPreferences(MyPreference, Context.MODE_APPEND);

        final Student  student = new Student();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = editTextName.getText().toString();
                String e = editTextEmail.getText().toString();
                String p = editTextPhone.getText().toString();

                student.setName(n);
                student.setEmail(e);
                student.setPhone(p);

                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString(Name,n);
                editor.putString(Email,e);
                editor.putString(Phone,p);
                editor.commit();

            }
        }); */

    }
}
