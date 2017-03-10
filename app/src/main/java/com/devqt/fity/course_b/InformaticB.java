package com.devqt.fity.course_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.DayInfB;
import com.devqt.fity.days_b.DayInfSC;
import com.devqt.fity.days_b.DayInfTh;

public class InformaticB extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informatica_b);

        findViewById(R.id.first_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InformaticB.this, DayInfB.class));
            }
        });

        findViewById(R.id.second_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InformaticB.this, DayInfSC.class));
            }
        });
        findViewById(R.id.third_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InformaticB.this, DayInfTh.class));
            }
        });


    }



}
