package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.informat_b_t.ChtBThirdInf;
import com.devqt.fity.days_b.informat_b_t.PnBThirdInf;
import com.devqt.fity.days_b.informat_b_t.PtBThirdInf;
import com.devqt.fity.days_b.informat_b_t.SbtBThirdInf;
import com.devqt.fity.days_b.informat_b_t.SrBThirdInf;
import com.devqt.fity.days_b.informat_b_t.VtBThirdInf;

public class DayInfTh extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfTh.this, PnBThirdInf.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfTh.this, VtBThirdInf.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfTh.this, SrBThirdInf.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfTh.this, ChtBThirdInf.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfTh.this, PtBThirdInf.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayInfTh.this, SbtBThirdInf.class));
            }
        });
    }
}