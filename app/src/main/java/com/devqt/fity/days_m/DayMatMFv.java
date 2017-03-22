package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.mat_m_fv.ChtMFiveMat;
import com.devqt.fity.days_m.mat_m_fv.PnMFiveMat;
import com.devqt.fity.days_m.mat_m_fv.PtMFiveMat;
import com.devqt.fity.days_m.mat_m_fv.SbtMFiveMat;
import com.devqt.fity.days_m.mat_m_fv.SrMFiveMat;
import com.devqt.fity.days_m.mat_m_fv.VtMFiveMat;

public class DayMatMFv extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMFv.this, PnMFiveMat.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMFv.this, VtMFiveMat.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMFv.this, SrMFiveMat.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMFv.this, ChtMFiveMat.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMFv.this, PtMFiveMat.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMFv.this, SbtMFiveMat.class));
            }
        });
    }
}