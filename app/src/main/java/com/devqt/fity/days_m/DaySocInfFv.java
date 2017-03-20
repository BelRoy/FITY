package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.soc_informat_m_fv.ChtMFiveSocInf;
import com.devqt.fity.days_m.soc_informat_m_fv.PnMFiveSocInf;
import com.devqt.fity.days_m.soc_informat_m_fv.PtMFiveSocInf;
import com.devqt.fity.days_m.soc_informat_m_fv.SbtMFiveSocInf;
import com.devqt.fity.days_m.soc_informat_m_fv.SrMFiveSocInf;
import com.devqt.fity.days_m.soc_informat_m_fv.VtMFiveSocInf;

public class DaySocInfFv extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfFv.this, PnMFiveSocInf.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfFv.this, VtMFiveSocInf.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfFv.this, SrMFiveSocInf.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfFv.this, ChtMFiveSocInf.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfFv.this, PtMFiveSocInf.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfFv.this, SbtMFiveSocInf.class));
            }
        });
    }
}