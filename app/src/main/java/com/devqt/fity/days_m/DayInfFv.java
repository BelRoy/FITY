package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.informat_m_fv.ChtMFiveInf;
import com.devqt.fity.days_m.informat_m_fv.PnMFiveInf;
import com.devqt.fity.days_m.informat_m_fv.PtMFiveInf;
import com.devqt.fity.days_m.informat_m_fv.SbtMFiveInf;
import com.devqt.fity.days_m.informat_m_fv.SrMFiveInf;
import com.devqt.fity.days_m.informat_m_fv.VtMFiveInf;

public class DayInfFv extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFv.this, PnMFiveInf.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFv.this, VtMFiveInf.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFv.this, SrMFiveInf.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFv.this, ChtMFiveInf.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFv.this, PtMFiveInf.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFv.this, SbtMFiveInf.class));
            }
        });
    }
}