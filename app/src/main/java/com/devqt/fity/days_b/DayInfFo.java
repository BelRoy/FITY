package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.informat_b_fo.ChtBFourthInf;
import com.devqt.fity.days_b.informat_b_fo.PnBFourthInf;
import com.devqt.fity.days_b.informat_b_fo.PtBFourthInf;
import com.devqt.fity.days_b.informat_b_fo.SbtBFourthInf;
import com.devqt.fity.days_b.informat_b_fo.SrBFourthInf;
import com.devqt.fity.days_b.informat_b_fo.VtBFourthInf;

public class DayInfFo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFo.this, PnBFourthInf.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFo.this, VtBFourthInf.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFo.this, SrBFourthInf.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFo.this, ChtBFourthInf.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFo.this, PtBFourthInf.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfFo.this, SbtBFourthInf.class));
            }
        });
    }
}