package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.mat_m_sx.ChtMSixMat;
import com.devqt.fity.days_m.mat_m_sx.PnMSixMat;
import com.devqt.fity.days_m.mat_m_sx.PtMSixMat;
import com.devqt.fity.days_m.mat_m_sx.SbtMSixMat;
import com.devqt.fity.days_m.mat_m_sx.SrMSixMat;
import com.devqt.fity.days_m.mat_m_sx.VtMSixMat;

public class DayMatMSx extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMSx.this, PnMSixMat.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMSx.this, VtMSixMat.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMSx.this, SrMSixMat.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMSx.this, ChtMSixMat.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMSx.this, PtMSixMat.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatMSx.this, SbtMSixMat.class));
            }
        });
    }
}