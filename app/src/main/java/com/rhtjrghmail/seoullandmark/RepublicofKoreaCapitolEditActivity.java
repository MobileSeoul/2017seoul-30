package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class RepublicofKoreaCapitolEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_republicof_korea_capitol_edit);

        //대한민국 국회의사당 기본 정보부분 이동
        ImageButton RepublicofKoreaCapitolShortTextLandmark = (ImageButton)findViewById(R.id.RepublicofKoreaCapitolShortTextButton);
        RepublicofKoreaCapitolShortTextLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        RepublicofKoreaCapitolShortTextActivity.class);
                startActivity(intent);
            }
        });

        //대한민국 국회의사당 링크부분 이동
        ImageButton RepublicofKoreaCapitolLinkLandmark = (ImageButton)findViewById(R.id.RepublicofKoreaCapitolLinkButton);
        RepublicofKoreaCapitolLinkLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        RepublicofKoreaCapitolLinkActivity.class);
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
