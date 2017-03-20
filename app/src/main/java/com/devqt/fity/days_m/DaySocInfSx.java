package com.devqt.fity.days_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.soc_informat_m_sx.ChtMSixSocInf;
import com.devqt.fity.days_m.soc_informat_m_sx.PnMSixSocInf;
import com.devqt.fity.days_m.soc_informat_m_sx.PtMSixSocInf;
import com.devqt.fity.days_m.soc_informat_m_sx.SbtMSixSocInf;
import com.devqt.fity.days_m.soc_informat_m_sx.SrMSixSocInf;
import com.devqt.fity.days_m.soc_informat_m_sx.VtMSixSocInf;

public class DaySocInfSx extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_inf);


        findViewById(R.id.pnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfSx.this, PnMSixSocInf.class));
            }
        });
        findViewById(R.id.vtr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfSx.this, VtMSixSocInf.class));
            }
        });
        findViewById(R.id.srd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfSx.this, SrMSixSocInf.class));
            }
        });
        findViewById(R.id.cht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfSx.this, ChtMSixSocInf.class));
            }
        });
        findViewById(R.id.ptn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfSx.this, PtMSixSocInf.class));
            }
        });
        findViewById(R.id.sbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaySocInfSx.this, SbtMSixSocInf.class));
            }
        });
    }
}