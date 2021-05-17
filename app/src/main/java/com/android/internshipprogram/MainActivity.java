package com.android.internshipprogram;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber1,editTextNumber2,editTextNumber3;
    Button confirm_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1=(EditText)findViewById(R.id.editTextNumber1);
        editTextNumber2=(EditText)findViewById(R.id.editTextNumber2);
        editTextNumber3=(EditText)findViewById(R.id.editTextNumber3);
        confirm_button=(Button)findViewById(R.id.confirm_button);
        confirm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}