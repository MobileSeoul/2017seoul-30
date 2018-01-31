package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class GardenFiveEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden_five_edit);

        //가든파이브 기본 정보부분 이동
        ImageButton GardenFiveShortTextLandmark = (ImageButton)findViewById(R.id.GardenFiveShortTextButton);
        GardenFiveShortTextLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GardenFiveShortTextActivity.class);
                startActivity(intent);
            }
        });

        //가든파이브 링크부분 이동
        ImageButton GardenFiveLinkLandmark = (ImageButton)findViewById(R.id.GardenFiveLinkButton);
        GardenFiveLinkLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GardenFiveLinkActivity.class);
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

    }
}
