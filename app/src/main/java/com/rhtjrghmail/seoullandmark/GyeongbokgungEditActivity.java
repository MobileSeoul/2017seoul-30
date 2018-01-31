package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class GyeongbokgungEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeongbokgung_edit);

        //경복궁 기본 정보부분 이동
        ImageButton GyeongbokgungShortTextLandmark = (ImageButton)findViewById(R.id.GyeongbokgungShortTextButton);
        GyeongbokgungShortTextLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GyeongbokgungShortTextActivity.class);
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
