package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class NamsangolHanokVillageLinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namsangol_hanok_village_link);

        //남산골한옥마을 기본 정보부분 이동
        ImageButton NamsangolHanokVillageShortTextLandmark = (ImageButton)findViewById(R.id.NamsangolHanokVillageShortTextButton);
        NamsangolHanokVillageShortTextLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NamsangolHanokVillageShortTextActivity.class);
                startActivity(intent);
            }
        });

        //남산골한옥마을 설명부분 이동
        ImageButton NamsangolHanokVillageEditLandmark = (ImageButton)findViewById(R.id.NamsangolHanokVillageEditButton);
        NamsangolHanokVillageEditLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NamsangolHanokVillageEditActivity.class);
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
