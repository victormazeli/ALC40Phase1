package com.example.alc40phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        getSupportActionBar().setTitle("My Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
