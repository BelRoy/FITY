package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.menej_b_f.ChtBFirstMenej;
import com.devqt.fity.days_b.menej_b_f.PnBFirstMenej;
import com.devqt.fity.days_b.menej_b_f.PtBFirstMenej;
import com.devqt.fity.days_b.menej_b_f.SbtBFirstMenej;
import com.devqt.fity.days_b.menej_b_f.SrBFirstMenej;
import com.devqt.fity.days_b.menej_b_f.VtBFirstMenej;

public class DayMenejF extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejF.this, PnBFirstMenej.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejF.this, VtBFirstMenej.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejF.this, SrBFirstMenej.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejF.this, ChtBFirstMenej.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejF.this, PtBFirstMenej.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejF.this, SbtBFirstMenej.class));
            }
        });
    }
}