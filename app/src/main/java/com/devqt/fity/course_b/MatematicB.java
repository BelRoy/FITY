package com.devqt.fity.course_b;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_b.DayMatB;
import com.devqt.fity.days_b.DayMatFo;
import com.devqt.fity.days_b.DayMatSC;
import com.devqt.fity.days_b.DayMatTh;

public class MatematicB extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matematica_b);

        findViewById(R.id.first_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MatematicB.this, DayMatB.class
                ));
            }
        });

        findViewById(R.id.second_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MatematicB.this, DayMatSC.class));
            }
        });

        findViewById(R.id.third_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MatematicB.this, DayMatTh.class));
            }
        });

        findViewById(R.id.fo_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MatematicB.this, DayMatFo.class));
            }
        });
    }

}
