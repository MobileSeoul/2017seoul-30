package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class NSeoulTowerShortTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nseoul_tower_short_text);

        //N서울타워 설명부분 이동
        ImageButton NSeoulTowerEditLandmark = (ImageButton)findViewById(R.id.NSeoulTowerEditButton);
        NSeoulTowerEditLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NSeoulTowerEditActivity.class);
                startActivity(intent);
            }
        });

        //N서울타워 링크부분 이동
        ImageButton NSeoulTowerLinkLandmark = (ImageButton)findViewById(R.id.NSeoulTowerLinkButton);
        NSeoulTowerLinkLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NSeoulTowerLinkActivity.class);
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
