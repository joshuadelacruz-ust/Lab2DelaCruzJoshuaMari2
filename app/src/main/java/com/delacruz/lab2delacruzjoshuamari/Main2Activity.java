package com.delacruz.lab2delacruzjoshuamari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText etCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);

        etCourse = findViewById(R.id.editText9);
        String course = etCourse.getText().toString();
        String name = sp.getString(course,null);

        boolean var = sp.contains(name);
        if(var == true){
            Toast.makeText(this, "Course offered", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Course not offered", Toast.LENGTH_LONG).show();
        }


    }

    public void prevPage(View v){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}
