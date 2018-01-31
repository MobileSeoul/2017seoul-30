package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_god);

        Button GoAllActivity = (Button)findViewById(R.id.activity_God_AllButton);
        GoAllActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        AllActivity.class);
                startActivity(intent);
            }
        });

        Button GoHistoryActivity = (Button)findViewById(R.id.activity_God_HistoryButton);
        GoHistoryActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HistoryActivity.class);
                startActivity(intent);
            }
        });


        Button GoTowerActivity = (Button)findViewById(R.id.activity_God_TowerButton);
        GoTowerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        TowerActivity.class);
                startActivity(intent);
            }
        });

        Button GoParkActivity = (Button)findViewById(R.id.activity_God_ParkButton);
        GoParkActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ParkActivity.class);
                startActivity(intent);
            }
        });



        Button GoEnjoyActivity = (Button)findViewById(R.id.activity_God_EnjoyButton);
        GoEnjoyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EnjoyActivity.class);
                startActivity(intent);
            }
        });

        Button GoEtcActivity = (Button)findViewById(R.id.activity_God_EtcButton);
        GoEtcActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EtcActivity.class);
                startActivity(intent);
            }
        });

        ImageButton GoHome = (ImageButton)findViewById(R.id.HomeButton);
        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainSelectActivity.class);
                startActivity(intent);
            }
        });

        ImageButton GoInfo = (ImageButton)findViewById(R.id.InfoButton);
        GoInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        InfoActivity.class);
                startActivity(intent);
            }
        });

    }
}
