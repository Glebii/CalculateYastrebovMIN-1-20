package com.example.calculateyastrebovmin_1_20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sumBtn;
    private Button multiplicationBtn;
    EditText firstNumField;
    EditText secondNumField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumBtn = (Button) findViewById(R.id.sum);
        multiplicationBtn = (Button) findViewById(R.id.multiplication);
        firstNumField = findViewById(R.id.first_num);
        secondNumField = findViewById(R.id.second_num);
        sumBtn.setOnClickListener(view -> {
            int first_num = Integer.parseInt(firstNumField.getText().toString());
            int second_num = Integer.parseInt(secondNumField.getText().toString());
            String result =  "The result is: "+ (first_num + second_num);
            Toast toast = Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP,0,170);
            toast.show();

        });
        multiplicationBtn.setOnClickListener(view -> {
            int first_num = Integer.parseInt(firstNumField.getText().toString());
            int second_num = Integer.parseInt(secondNumField.getText().toString());
            String result =  "The result is: "+ (first_num * second_num);
            Toast toast = Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP,0,170);
            toast.show();

        });
    }

}