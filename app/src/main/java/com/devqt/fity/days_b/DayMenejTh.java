package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.menej_b_t.ChtBThirdMenej;
import com.devqt.fity.days_b.menej_b_t.PnBThirdMenej;
import com.devqt.fity.days_b.menej_b_t.PtBThirdMenej;
import com.devqt.fity.days_b.menej_b_t.SbtBThirdMenej;
import com.devqt.fity.days_b.menej_b_t.SrBThirdMenej;
import com.devqt.fity.days_b.menej_b_t.VtBThirdMenej;

public class DayMenejTh extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejTh.this, PnBThirdMenej.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejTh.this, VtBThirdMenej.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejTh.this, SrBThirdMenej.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejTh.this, ChtBThirdMenej.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejTh.this, PtBThirdMenej.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejTh.this, SbtBThirdMenej.class));
            }
        });
    }
}