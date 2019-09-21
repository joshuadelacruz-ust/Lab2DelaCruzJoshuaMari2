package com.delacruz.lab2delacruzjoshuamari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etCourse1, etCourse2, etCourse3, etCourse4, etCourse5, etCourse6, etCourse7, etCourse8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCourse1 = findViewById(R.id.editText);
        etCourse2 = findViewById(R.id.editText2);
        etCourse3 = findViewById(R.id.editText3);
        etCourse4 = findViewById(R.id.editText4);
        etCourse5 = findViewById(R.id.editText5);
        etCourse6 = findViewById(R.id.editText6);
        etCourse7 = findViewById(R.id.editText7);
        etCourse8 = findViewById(R.id.editText8);
    }

    public void viewData(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        String course1 = etCourse1.getText().toString();
        String course2 = etCourse2.getText().toString();
        String course3 = etCourse3.getText().toString();
        String course4 = etCourse4.getText().toString();
        String course5 = etCourse5.getText().toString();
        String course6 = etCourse6.getText().toString();
        String course7 = etCourse7.getText().toString();
        String course8 = etCourse8.getText().toString();

        editor.putString(course1, course1);
        editor.putString(course2, course2);
        editor.putString(course3, course3);
        editor.putString(course4, course4);
        editor.putString(course5, course5);
        editor.putString(course6, course6);
        editor.putString(course7, course7);
        editor.putString(course8, course8);
        editor.apply();

        Toast.makeText(this, "Course was saved...", Toast.LENGTH_LONG);
    }

    public void nextPage(View v){
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);
    }

}
