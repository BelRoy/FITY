package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.mat_b_fo.ChtBFourthMat;
import com.devqt.fity.days_b.mat_b_fo.PnBFourthMat;
import com.devqt.fity.days_b.mat_b_fo.PtBFourthMat;
import com.devqt.fity.days_b.mat_b_fo.SbtBFourthMat;
import com.devqt.fity.days_b.mat_b_fo.SrBFourthMat;
import com.devqt.fity.days_b.mat_b_fo.VtBFourthMat;

public class DayMatFo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatFo.this, PnBFourthMat.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatFo.this, VtBFourthMat.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatFo.this, SrBFourthMat.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatFo.this, ChtBFourthMat.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatFo.this, PtBFourthMat.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatFo.this, SbtBFourthMat.class));
            }
        });
    }
}