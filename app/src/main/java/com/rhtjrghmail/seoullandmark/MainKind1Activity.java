package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainKind1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kind1);

        Button GoAllActivity = (Button)findViewById(R.id.AllButton);
        GoAllActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        AllActivity.class);
                startActivity(intent);
            }
        });

        Button GoHistoryActivity = (Button)findViewById(R.id.HistoryButton);
        GoHistoryActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HistoryActivity.class);
                startActivity(intent);
            }
        });

        Button GoTowerActivity = (Button)findViewById(R.id.TowerButton);
        GoTowerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                       TowerActivity.class);
                startActivity(intent);
            }
        });

        Button GoParkActivity = (Button)findViewById(R.id.ParkButton);
        GoParkActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ParkActivity.class);
                startActivity(intent);
            }
        });

        Button GoGodActivity = (Button)findViewById(R.id.GodButton);
        GoGodActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GodActivity.class);
                startActivity(intent);
            }
        });

        Button GoEnjoyActivity = (Button)findViewById(R.id.EnjoyButton);
        GoEnjoyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EnjoyActivity.class);
                startActivity(intent);
            }
        });

        Button GoEtcActivity = (Button)findViewById(R.id.EtcButton);
        GoEtcActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EtcActivity.class);
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



    }
}
