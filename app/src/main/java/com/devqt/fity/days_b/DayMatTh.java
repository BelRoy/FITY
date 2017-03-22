package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.mat_b_t.ChtBThirdMat;
import com.devqt.fity.days_b.mat_b_t.PnBThirdMat;
import com.devqt.fity.days_b.mat_b_t.PtBThirdMat;
import com.devqt.fity.days_b.mat_b_t.SbtBThirdMat;
import com.devqt.fity.days_b.mat_b_t.SrBThirdMat;
import com.devqt.fity.days_b.mat_b_t.VtBThirdMat;

public class DayMatTh extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatTh.this, PnBThirdMat.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatTh.this, VtBThirdMat.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatTh.this, SrBThirdMat.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatTh.this, ChtBThirdMat.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatTh.this, PtBThirdMat.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatTh.this, SbtBThirdMat.class));
            }
        });
    }
}