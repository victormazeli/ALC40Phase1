package com.example.alc40phase1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =  findViewById(R.id.aboutalc);
        Button button1 = findViewById(R.id.myprofile);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.aboutalc:
                Intent intent = new Intent(MainActivity.this, AboutAlc.class);
                startActivity(intent);
                break;
            case R.id.myprofile:
                Intent intent1 = new Intent(MainActivity.this, Profile.class);
                startActivity(intent1);
                break;
                default:
                    break;
        }
    }
}
