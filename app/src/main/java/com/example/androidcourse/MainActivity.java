package com.example.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    private Button minusBtn;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.valTxt);
        minusBtn = findViewById(R.id.minusBtn);
        addBtn = findViewById(R.id.addBtn);
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                minusOne();
            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addOne();
            }
        });
    }


    public void addOne() {
        // Suma 1 al textview
        int value = Integer.parseInt(text.getText().toString());
        ++value;
        text.setText(String.valueOf(value));

    }

    public void minusOne() {
        // Resta 1 al textview
        int value = Integer.parseInt(text.getText().toString());
        --value;
        text.setText(String.valueOf(value));
    }

}