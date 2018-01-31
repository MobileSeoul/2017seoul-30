package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.rhtjrghmail.seoullandmark.R.id.GardenFiveButton;
import static com.rhtjrghmail.seoullandmark.R.id.NSeoulTowerButton;

public class TowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tower);

        Button GoAllActivity = (Button)findViewById(R.id.activity_Tower_AllButton);
        GoAllActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        AllActivity.class);
                startActivity(intent);
            }
        });

        Button GoHistoryActivity = (Button)findViewById(R.id.activity_Tower_HistoryButton);
        GoHistoryActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HistoryActivity.class);
                startActivity(intent);
            }
        });


        Button GoParkActivity = (Button)findViewById(R.id.activity_Tower_ParkButton);
        GoParkActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ParkActivity.class);
                startActivity(intent);
            }
        });

        Button GoGodActivity = (Button)findViewById(R.id.activity_Tower_GodButton);
        GoGodActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GodActivity.class);
                startActivity(intent);
            }
        });



        Button GoEnjoyActivity = (Button)findViewById(R.id.activity_Tower_EnjoyButton);
        GoEnjoyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EnjoyActivity.class);
                startActivity(intent);
            }
        });

        Button GoEtcActivity = (Button)findViewById(R.id.activity_Tower_EtcButton);
        GoEtcActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EtcActivity.class);
                startActivity(intent);
            }
        });

        //63 빌딩 랜드마크 이동
        Button SixtythreeBuildingLandmark = (Button)findViewById(R.id.SixtythreeBuildingButton);
        SixtythreeBuildingLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        SixtythreeBuildingShortTextActivity.class);
                startActivity(intent);
            }
        });



        //N서울타워 랜드마크 이동
        Button NSeoulTowerLandmark = (Button)findViewById(NSeoulTowerButton);
        NSeoulTowerLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NSeoulTowerShortTextActivity.class);
                startActivity(intent);
            }
        });

        //가든파이브 랜드마크 이동
        Button GardenFiveLandmark = (Button)findViewById(GardenFiveButton);
        GardenFiveLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GardenFiveShortTextActivity.class);
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
