package com.devqt.fity.course_b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.DayMenejF;
import com.devqt.fity.days_b.DayMenejFo;
import com.devqt.fity.days_b.DayMenejSC;
import com.devqt.fity.days_b.DayMenejTh;

public class MenedjmentB extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menedjment_b);

        findViewById(R.id.first_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenedjmentB.this, DayMenejF.class));
            }
        });
        findViewById(R.id.second_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenedjmentB.this, DayMenejSC.class));
            }
        });
        findViewById(R.id.third_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenedjmentB.this, DayMenejTh.class));
            }
        });
        findViewById(R.id.fo_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenedjmentB.this, DayMenejFo.class));
            }
        });
    }

}
