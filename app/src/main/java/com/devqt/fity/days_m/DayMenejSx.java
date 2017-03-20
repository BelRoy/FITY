package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.menej_m_sx.ChtMSixMenej;
import com.devqt.fity.days_m.menej_m_sx.PnMSixMenej;
import com.devqt.fity.days_m.menej_m_sx.PtMSixMenej;
import com.devqt.fity.days_m.menej_m_sx.SbtMSixMenej;
import com.devqt.fity.days_m.menej_m_sx.SrMSixMenej;
import com.devqt.fity.days_m.menej_m_sx.VtMSixMenej;

public class DayMenejSx extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSx.this, PnMSixMenej.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSx.this, VtMSixMenej.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSx.this, SrMSixMenej.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSx.this, ChtMSixMenej.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSx.this, PtMSixMenej.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSx.this, SbtMSixMenej.class));
            }
        });
    }
}