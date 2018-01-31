package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.rhtjrghmail.seoullandmark.R.id.GyeongbokgungButton;
import static com.rhtjrghmail.seoullandmark.R.id.GyeonghuigungButton;
import static com.rhtjrghmail.seoullandmark.R.id.NamsangolhanokvillageButton;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

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

        Button GoAllActivity = (Button)findViewById(R.id.activity_History_AllButton);
        GoAllActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        AllActivity.class);
                startActivity(intent);
            }
        });

        Button GoTowerActivity = (Button)findViewById(R.id.activity_History_TowerButton);
        GoTowerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        TowerActivity.class);
                startActivity(intent);
            }
        });


        Button GoParkActivity = (Button)findViewById(R.id.activity_History_ParkButton);
        GoParkActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ParkActivity.class);
                startActivity(intent);
            }
        });

        Button GoGodActivity = (Button)findViewById(R.id.activity_History_GodButton);
        GoGodActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GodActivity.class);
                startActivity(intent);
            }
        });



        Button GoEnjoyActivity = (Button)findViewById(R.id.activity_History_EnjoyButton);
        GoEnjoyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EnjoyActivity.class);
                startActivity(intent);
            }
        });

        Button GoEtcActivity = (Button)findViewById(R.id.activity_History_EtcButton);
        GoEtcActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EtcActivity.class);
                startActivity(intent);
            }
        });

        //경복궁 랜드마크 이동
        Button GyeongbokgungLandmark = (Button)findViewById(GyeongbokgungButton);
        GyeongbokgungLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GyeongbokgungShortTextActivity.class);
                startActivity(intent);
            }
        });

        //경희궁 랜드마크 이동
        Button GyeonghuigungLandmark = (Button)findViewById(GyeonghuigungButton);
        GyeonghuigungLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GyeonghuigungShortTextActivity.class);
                startActivity(intent);
            }
        });

        //남산골한옥마을 랜드마크 이동
        Button NamsangolHanokVillageLandmark = (Button)findViewById(NamsangolhanokvillageButton);
        NamsangolHanokVillageLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NamsangolHanokVillageShortTextActivity.class);
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
