package com.devqt.fity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devqt.fity.course_b.FiKB;
import com.devqt.fity.course_b.InformaticB;
import com.devqt.fity.course_b.MatematicB;
import com.devqt.fity.course_b.MenedjmentB;

public class Bachelor extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.bachelor_act);

        findViewById(R.id.inf_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bachelor.this, InformaticB.class));
            }
        });

        findViewById(R.id.menedjer_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bachelor.this, MenedjmentB.class));
            }
        });
        findViewById(R.id.matem_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bachelor.this, MatematicB.class));
            }
        });

        findViewById(R.id.finans_credit_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bachelor.this, FiKB.class ));
            }
        });





    }

}
