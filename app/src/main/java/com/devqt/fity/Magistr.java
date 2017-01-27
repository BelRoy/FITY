package com.devqt.fity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.course_m.DY;
import com.devqt.fity.course_m.FiKM;
import com.devqt.fity.course_m.InformaticM;
import com.devqt.fity.course_m.MatematicM;
import com.devqt.fity.course_m.MenedjmentM;
import com.devqt.fity.course_m.SocInformaticM;

public class Magistr extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.magistr_act);


        findViewById(R.id.inf_m).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Magistr.this, InformaticM.class));
            }
        });

        findViewById(R.id.soc_inf).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Magistr.this, SocInformaticM.class));
            }
        });

        findViewById(R.id.menedjer_m).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Magistr.this, MenedjmentM.class));
            }
        });

        findViewById(R.id.matem_m).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Magistr.this, MatematicM.class));
            }
        });

        findViewById(R.id.finans_credit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Magistr.this, FiKM.class));
            }
        });

        findViewById(R.id.dy_m).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Magistr.this, DY.class));
            }
        });

    }

}
