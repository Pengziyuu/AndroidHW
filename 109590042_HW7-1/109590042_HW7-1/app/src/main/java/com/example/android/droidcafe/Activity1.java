package com.example.android.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        getSupportActionBar().setTitle("Activity 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}