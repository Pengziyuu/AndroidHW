package com.example.android.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        getSupportActionBar().setTitle("Activity 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}