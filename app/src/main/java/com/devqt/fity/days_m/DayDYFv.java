package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.dy_m_fv.ChtMFiveDY;
import com.devqt.fity.days_m.dy_m_fv.PnMFiveDY;
import com.devqt.fity.days_m.dy_m_fv.PtMFiveDY;
import com.devqt.fity.days_m.dy_m_fv.SbtMFiveDY;
import com.devqt.fity.days_m.dy_m_fv.SrMFiveDY;
import com.devqt.fity.days_m.dy_m_fv.VtMFiveDY;

public class DayDYFv extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYFv.this, PnMFiveDY.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYFv.this, VtMFiveDY.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYFv.this, SrMFiveDY.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYFv.this, ChtMFiveDY.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYFv.this, PtMFiveDY.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYFv.this, SbtMFiveDY.class));
            }
        });
    }
}