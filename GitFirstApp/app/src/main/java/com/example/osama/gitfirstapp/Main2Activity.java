package com.example.osama.gitfirstapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    public static final String MyPreference = "MyPref";
    public static final String Name = "MyName";
    public static final String Email= "MyEmail";
    public static final String Phone = "MyPhone";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText editTextName = (EditText)findViewById(R.id.etName);
        final EditText editTextEmail = (EditText)findViewById(R.id.etEmail);
        final EditText editTextPhone = (EditText)findViewById(R.id.etNumber);

        Button button = (Button)findViewById(R.id.addbtn);

        sharedPreferences = getSharedPreferences(MyPreference, Context.MODE_APPEND);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = editTextName.getText().toString();
                String e = editTextEmail.getText().toString();
                String p = editTextPhone.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString(Name,n);
                editor.putString(Email,e);
                editor.putString(Phone,p);
                editor.commit();

            }
        });

    }
}
