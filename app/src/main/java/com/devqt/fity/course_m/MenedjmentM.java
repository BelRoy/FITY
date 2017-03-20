package com.devqt.fity.course_m;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.DayMenejFv;
import com.devqt.fity.days_m.DayMenejSx;


public class MenedjmentM extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menedjment_m);

    findViewById(R.id.five_cr).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MenedjmentM.this, DayMenejFv.class));
        }
    });

        findViewById(R.id.six_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenedjmentM.this, DayMenejSx.class));
            }
        });
    }

}
