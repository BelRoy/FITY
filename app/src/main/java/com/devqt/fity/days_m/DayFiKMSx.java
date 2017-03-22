package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.fik_m_sx.ChtMSixFiK;
import com.devqt.fity.days_m.fik_m_sx.PnMSixFiK;
import com.devqt.fity.days_m.fik_m_sx.PtMSixFiK;
import com.devqt.fity.days_m.fik_m_sx.SbtMSixFiK;
import com.devqt.fity.days_m.fik_m_sx.SrMSixFiK;
import com.devqt.fity.days_m.fik_m_sx.VtMSixFiK;

public class DayFiKMSx extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMSx.this, PnMSixFiK.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMSx.this, VtMSixFiK.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMSx.this, SrMSixFiK.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMSx.this, ChtMSixFiK.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMSx.this, PtMSixFiK.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMSx.this, SbtMSixFiK.class));
            }
        });
    }
}