package com.devqt.fity.course_b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.DayFiKF;
import com.devqt.fity.days_b.DayFiKFo;
import com.devqt.fity.days_b.DayFiKSC;
import com.devqt.fity.days_b.DayFiKTh;


public class FiKB extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fik_b);

        findViewById(R.id.first_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FiKB.this, DayFiKF.class));
            }
        });

        findViewById(R.id.second_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FiKB.this, DayFiKSC.class));
            }
        });

        findViewById(R.id.third_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FiKB.this, DayFiKTh.class));
            }
        });

        findViewById(R.id.fo_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FiKB.this, DayFiKFo.class));
            }
        });
    }

}
