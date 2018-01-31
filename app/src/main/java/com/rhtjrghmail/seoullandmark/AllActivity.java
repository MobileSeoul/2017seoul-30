package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.rhtjrghmail.seoullandmark.R.id.GardenFiveButton;
import static com.rhtjrghmail.seoullandmark.R.id.GyeongbokgungButton;
import static com.rhtjrghmail.seoullandmark.R.id.GyeonghuigungButton;
import static com.rhtjrghmail.seoullandmark.R.id.NSeoulTowerButton;
import static com.rhtjrghmail.seoullandmark.R.id.NamsangolhanokvillageButton;
import static com.rhtjrghmail.seoullandmark.R.id.RepublicofKoreaCapitolButton;

public class AllActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        Button GoHistoryActivity = (Button)findViewById(R.id.activity_all_HistoryButton);
        GoHistoryActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HistoryActivity.class);
                startActivity(intent);
            }
        });

        Button GoTowerActivity = (Button)findViewById(R.id.activity_all_TowerButton);
        GoTowerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        TowerActivity.class);
                startActivity(intent);
            }
        });


        Button GoParkActivity = (Button)findViewById(R.id.activity_all_ParkButton);
        GoParkActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ParkActivity.class);
                startActivity(intent);
            }
        });

        Button GoGodActivity = (Button)findViewById(R.id.activity_all_GodButton);
        GoGodActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GodActivity.class);
                startActivity(intent);
            }
        });



        Button GoEnjoyActivity = (Button)findViewById(R.id.activity_all_EnjoyButton);
        GoEnjoyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        EnjoyActivity.class);
                startActivity(intent);
            }
        });

        Button GoEtcActivity = (Button)findViewById(R.id.activity_all_EtcButton);
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

        //대한민국 국회의사당 랜드마크 이동
        Button RepublicofKoreaCapitolLandmark = (Button)findViewById(RepublicofKoreaCapitolButton);
        RepublicofKoreaCapitolLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        RepublicofKoreaCapitolShortTextActivity.class);
                startActivity(intent);
            }
        });



        //홈 버튼 이동
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


        //정보 버튼 이동
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
