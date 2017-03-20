package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.menej_b_s.ChtBSecondMenej;
import com.devqt.fity.days_b.menej_b_s.PnBSecondMenej;
import com.devqt.fity.days_b.menej_b_s.PtBSecondMenej;
import com.devqt.fity.days_b.menej_b_s.SbtBSecondMenej;
import com.devqt.fity.days_b.menej_b_s.SrBSecondMenej;
import com.devqt.fity.days_b.menej_b_s.VtBSecondMenej;

public class DayMenejSC extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSC.this, PnBSecondMenej.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSC.this, VtBSecondMenej.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSC.this, SrBSecondMenej.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSC.this, ChtBSecondMenej.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSC.this, PtBSecondMenej.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejSC.this, SbtBSecondMenej.class));
            }
        });
    }
}