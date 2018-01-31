package com.rhtjrghmail.seoullandmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_select);

        Button GoMainKind1Activity = (Button)findViewById(R.id.kind1);
        GoMainKind1Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainKind1Activity.class);
                startActivity(intent);
            }
        });

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

    @Override
    public void onBackPressed() {
        super.finish();
    }


}
