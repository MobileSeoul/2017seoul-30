package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class GyeongbokgungShortTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeongbokgung_short_text);

        //경복궁 설명부분 이동
        ImageButton GyeongbokgungEditLandmark = (ImageButton)findViewById(R.id.GyeongbokgungEditButton);
        GyeongbokgungEditLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GyeongbokgungEditActivity.class);
                startActivity(intent);
            }
        });

        //경복궁 링크부분 이동
        ImageButton GyeongbokgungLinkLandmark = (ImageButton)findViewById(R.id.GyeongbokgungLinkButton);
        GyeongbokgungLinkLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GyeongbokgungLinkActivity.class);
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
