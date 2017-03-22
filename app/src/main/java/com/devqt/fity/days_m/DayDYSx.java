package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.dy_m_sx.ChtMSixDY;
import com.devqt.fity.days_m.dy_m_sx.PnMSixDY;
import com.devqt.fity.days_m.dy_m_sx.PtMSixDY;
import com.devqt.fity.days_m.dy_m_sx.SbtMSixDY;
import com.devqt.fity.days_m.dy_m_sx.SrMSixDY;
import com.devqt.fity.days_m.dy_m_sx.VtMSixDY;

public class DayDYSx extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYSx.this, PnMSixDY.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYSx.this, VtMSixDY.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYSx.this, SrMSixDY.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYSx.this, ChtMSixDY.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYSx.this, PtMSixDY.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayDYSx.this, SbtMSixDY.class));
            }
        });
    }
}