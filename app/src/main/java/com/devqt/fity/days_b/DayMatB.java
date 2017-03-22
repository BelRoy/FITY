package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.mat_b_f.ChtBFirstMat;
import com.devqt.fity.days_b.mat_b_f.PnBFirstMat;
import com.devqt.fity.days_b.mat_b_f.PtBFirstMat;
import com.devqt.fity.days_b.mat_b_f.SbtBFirstMat;
import com.devqt.fity.days_b.mat_b_f.SrBFirstMat;
import com.devqt.fity.days_b.mat_b_f.VtBFirstMat;

public class DayMatB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);



        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatB.this, PnBFirstMat.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatB.this, VtBFirstMat.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatB.this, SrBFirstMat.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatB.this, ChtBFirstMat.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatB.this, PtBFirstMat.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayMatB.this, SbtBFirstMat.class));
            }
        });
    }
}
