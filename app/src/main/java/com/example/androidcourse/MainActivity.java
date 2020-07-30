package com.example.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addOne(View view) {
        // Suma 1 al textview
        EditText text = (EditText) findViewById(R.id.valTxt);
        int value = Integer.parseInt(text.getText().toString());
        ++value;
        text.setText(String.valueOf(value));

    }

    public void minusOne(View view) {
        // Resta 1 al textview
        EditText text = (EditText) findViewById(R.id.valTxt);
        int value = Integer.parseInt(text.getText().toString());
        --value;
        text.setText(String.valueOf(value));
    }

}