package com.devqt.fity.course_m;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.DayFiKMFv;
import com.devqt.fity.days_m.DayFiKMSx;


public class FiKM extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fik_m);

        findViewById(R.id.five_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FiKM.this, DayFiKMFv.class));
            }
        });

        findViewById(R.id.six_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FiKM.this, DayFiKMSx.class));
            }
        });
    }



}
