package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.fik_b_s.ChtBSecondFiK;
import com.devqt.fity.days_b.fik_b_s.PnBSecondFiK;
import com.devqt.fity.days_b.fik_b_s.PtBSecondFiK;
import com.devqt.fity.days_b.fik_b_s.SbtBSecondFiK;
import com.devqt.fity.days_b.fik_b_s.SrBSecondFiK;
import com.devqt.fity.days_b.fik_b_s.VtBSecondFiK;

public class DayFiKSC extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKSC.this, PnBSecondFiK.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKSC.this, VtBSecondFiK.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKSC.this, SrBSecondFiK.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKSC.this, ChtBSecondFiK.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKSC.this, PtBSecondFiK.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKSC.this, SbtBSecondFiK.class));
            }
        });
    }
}