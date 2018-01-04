package com.example.jessicahuang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_parking);

        Intent intent = getIntent();
        ImageButton home = (ImageButton)findViewById(R.id.home);
        home.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });


    }

}
