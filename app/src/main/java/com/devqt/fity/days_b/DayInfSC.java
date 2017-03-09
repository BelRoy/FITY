package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.informat_b_s.ChtBSecondInf;
import com.devqt.fity.days_b.informat_b_s.PnBSecondInf;
import com.devqt.fity.days_b.informat_b_s.PtBSecondInf;
import com.devqt.fity.days_b.informat_b_s.SbtBSecondInf;
import com.devqt.fity.days_b.informat_b_s.SrBSecondInf;
import com.devqt.fity.days_b.informat_b_s.VtBSecondInf;

public class DayInfSC extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfSC.this, PnBSecondInf.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfSC.this, VtBSecondInf.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfSC.this, SrBSecondInf.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfSC.this, ChtBSecondInf.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfSC.this, PtBSecondInf.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfSC.this, SbtBSecondInf.class));
            }
        });
    }
}
