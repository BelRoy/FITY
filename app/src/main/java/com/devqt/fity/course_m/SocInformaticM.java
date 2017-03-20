package com.devqt.fity.course_m;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.R;
import com.devqt.fity.days_m.DaySocInfFv;
import com.devqt.fity.days_m.DaySocInfSx;

public class SocInformaticM extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_informatika_m);

        findViewById(R.id.five_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SocInformaticM.this, DaySocInfFv.class));
            }
        });

        findViewById(R.id.six_cr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SocInformaticM.this, DaySocInfSx.class));
            }
        });
    }

}
