package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.fik_m_fv.ChtMFiveFiK;
import com.devqt.fity.days_m.fik_m_fv.PnMFiveFiK;
import com.devqt.fity.days_m.fik_m_fv.PtMFiveFiK;
import com.devqt.fity.days_m.fik_m_fv.SbtMFiveFiK;
import com.devqt.fity.days_m.fik_m_fv.SrMFiveFiK;
import com.devqt.fity.days_m.fik_m_fv.VtMFiveFiK;

public class DayFiKMFv extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMFv.this, PnMFiveFiK.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMFv.this, VtMFiveFiK.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMFv.this, SrMFiveFiK.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMFv.this, ChtMFiveFiK.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMFv.this, PtMFiveFiK.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKMFv.this, SbtMFiveFiK.class));
            }
        });
    }
}