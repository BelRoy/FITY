package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.menej_b_fo.ChtBFourthMenej;
import com.devqt.fity.days_b.menej_b_fo.PnBFourthMenej;
import com.devqt.fity.days_b.menej_b_fo.PtBFourthMenej;
import com.devqt.fity.days_b.menej_b_fo.SbtBFourthMenej;
import com.devqt.fity.days_b.menej_b_fo.SrBFourthMenej;
import com.devqt.fity.days_b.menej_b_fo.VtBFourthMenej;

public class DayMenejFo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFo.this, PnBFourthMenej.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFo.this, VtBFourthMenej.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFo.this, SrBFourthMenej.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFo.this, ChtBFourthMenej.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFo.this, PtBFourthMenej.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMenejFo.this, SbtBFourthMenej.class));
            }
        });
    }
}