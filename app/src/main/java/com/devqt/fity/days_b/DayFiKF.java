package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.fik_b_f.ChtBFirstFiK;
import com.devqt.fity.days_b.fik_b_f.PnBFirstFiK;
import com.devqt.fity.days_b.fik_b_f.PtBFirstFiK;
import com.devqt.fity.days_b.fik_b_f.SbtBFirstFiK;
import com.devqt.fity.days_b.fik_b_f.SrBFirstFiK;
import com.devqt.fity.days_b.fik_b_f.VtBFirstFiK;

public class DayFiKF extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKF.this, PnBFirstFiK.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKF.this, VtBFirstFiK.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKF.this, SrBFirstFiK.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKF.this, ChtBFirstFiK.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKF.this, PtBFirstFiK.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKF.this, SbtBFirstFiK.class));
            }
        });
    }
}