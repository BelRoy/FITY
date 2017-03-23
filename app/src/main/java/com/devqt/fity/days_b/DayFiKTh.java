package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.fik_b_t.ChtBThirdFiK;
import com.devqt.fity.days_b.fik_b_t.PnBThirdFiK;
import com.devqt.fity.days_b.fik_b_t.PtBThirdFiK;
import com.devqt.fity.days_b.fik_b_t.SbtBThirdFiK;
import com.devqt.fity.days_b.fik_b_t.SrBThirdFiK;
import com.devqt.fity.days_b.fik_b_t.VtBThirdFiK;

public class DayFiKTh extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKTh.this, PnBThirdFiK.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKTh.this, VtBThirdFiK.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKTh.this, SrBThirdFiK.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKTh.this, ChtBThirdFiK.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKTh.this, PtBThirdFiK.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKTh.this, SbtBThirdFiK.class));
            }
        });
    }
}