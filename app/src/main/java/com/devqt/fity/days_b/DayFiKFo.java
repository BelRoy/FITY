package com.devqt.fity.days_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.fik_b_fo.ChtBFourthFiK;
import com.devqt.fity.days_b.fik_b_fo.PnBFourthFiK;
import com.devqt.fity.days_b.fik_b_fo.PtBFourthFiK;
import com.devqt.fity.days_b.fik_b_fo.SbtBFourthFiK;
import com.devqt.fity.days_b.fik_b_fo.SrBFourthFiK;
import com.devqt.fity.days_b.fik_b_fo.VtBFourthFiK;

public class DayFiKFo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKFo.this, PnBFourthFiK.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKFo.this, VtBFourthFiK.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKFo.this, SrBFourthFiK.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKFo.this, ChtBFourthFiK.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKFo.this, PtBFourthFiK.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayFiKFo.this, SbtBFourthFiK.class));
            }
        });
    }
}