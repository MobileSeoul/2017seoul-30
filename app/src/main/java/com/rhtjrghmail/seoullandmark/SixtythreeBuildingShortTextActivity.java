package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SixtythreeBuildingShortTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixtythree_building_short_text);

        //63빌딩 설명부분 이동
        ImageButton SixtythreeBuildingEditLandmark = (ImageButton)findViewById(R.id.SixtythreeBuildingEditButton);
        SixtythreeBuildingEditLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        SixtythreeBuildingEditActivity.class);
                startActivity(intent);
            }
        });

        //63빌딩 링크부분 이동
        ImageButton SixtythreeBuildingLinkLandmark = (ImageButton)findViewById(R.id.SixtythreeBuildingLinkButton);
        SixtythreeBuildingLinkLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        SixtythreeBuildingLinkActivity.class);
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
