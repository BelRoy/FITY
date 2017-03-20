package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.menej_m_fv.ChtMFiveMenej;
import com.devqt.fity.days_m.menej_m_fv.PnMFiveMenej;
import com.devqt.fity.days_m.menej_m_fv.PtMFiveMenej;
import com.devqt.fity.days_m.menej_m_fv.SbtMFiveMenej;
import com.devqt.fity.days_m.menej_m_fv.SrMFiveMenej;
import com.devqt.fity.days_m.menej_m_fv.VtMFiveMenej;

public class DayMenejFv extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFv.this, PnMFiveMenej.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFv.this, VtMFiveMenej.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFv.this, SrMFiveMenej.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFv.this, ChtMFiveMenej.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFv.this, PtMFiveMenej.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFv.this, SbtMFiveMenej.class));
            }
        });
    }
}