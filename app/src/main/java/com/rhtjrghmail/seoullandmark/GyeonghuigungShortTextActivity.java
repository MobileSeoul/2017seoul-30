package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class GyeonghuigungShortTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeonghuigung_short_text);

        //경희궁 설명부분 이동
        ImageButton GyeonghuigungEditLandmark = (ImageButton)findViewById(R.id.GyeonghuigungEditButton);
        GyeonghuigungEditLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GyeonghuigungEditActivity.class);
                startActivity(intent);
            }
        });

        //경희궁 링크부분 이동
        ImageButton GyeonghuigungLinkLandmark = (ImageButton)findViewById(R.id.GyeonghuigungLinkButton);
        GyeonghuigungLinkLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GyeonghuigungLinkActivity.class);
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
