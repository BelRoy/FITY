package com.devqt.fity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_menu);



            findViewById(R.id.confederate_blue).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(StartMenu.this, Bachelor.class));
                }
            });
            findViewById(R.id.confederate_red).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(StartMenu.this, Magistr.class));
                }
            });


        findViewById(R.id.calendar_view);

    }
}
