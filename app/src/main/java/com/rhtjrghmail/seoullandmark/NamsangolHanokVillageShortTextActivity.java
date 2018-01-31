package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class NamsangolHanokVillageShortTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namsangol_hanok_village_short_text);

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

        //남산골한옥마을 링크부분 이동
        ImageButton NamsangolHanokVillageLinkLandmark = (ImageButton)findViewById(R.id.NamsangolHanokVillageLinkButton);
        NamsangolHanokVillageLinkLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NamsangolHanokVillageLinkActivity.class);
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
