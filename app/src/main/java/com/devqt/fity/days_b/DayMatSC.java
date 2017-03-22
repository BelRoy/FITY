package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.mat_b_s.ChtBSecondMat;
import com.devqt.fity.days_b.mat_b_s.PnBSecondMat;
import com.devqt.fity.days_b.mat_b_s.PtBSecondMat;
import com.devqt.fity.days_b.mat_b_s.SbtBSecondMat;
import com.devqt.fity.days_b.mat_b_s.SrBSecondMat;
import com.devqt.fity.days_b.mat_b_s.VtBSecondMat;

public class DayMatSC extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatSC.this, PnBSecondMat.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatSC.this, VtBSecondMat.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatSC.this, SrBSecondMat.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatSC.this, ChtBSecondMat.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatSC.this, PtBSecondMat.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatSC.this, SbtBSecondMat.class));
            }
        });
    }
}
