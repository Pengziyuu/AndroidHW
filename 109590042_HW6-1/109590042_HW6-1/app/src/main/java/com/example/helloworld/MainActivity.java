package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cb1 = findViewById(R.id.checkBox1);
        CheckBox cb2 = findViewById(R.id.checkBox2);
        CheckBox cb3 = findViewById(R.id.checkBox3);
        CheckBox cb4 = findViewById(R.id.checkBox4);
        CheckBox cb5 = findViewById(R.id.checkBox5);
        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = " ";
                if(cb1.isChecked()) str = str+ " " + cb1.getText();
                if(cb2.isChecked()) str = str+ " " + cb2.getText();
                if(cb3.isChecked()) str = str+ " " + cb3.getText();
                if(cb4.isChecked()) str = str+ " " + cb4.getText();
                if(cb5.isChecked()) str = str+ " " + cb5.getText();
                Toast.makeText(getApplicationContext(), "Toppings:" + str, Toast.LENGTH_SHORT).show();
            }
        });
    }

}