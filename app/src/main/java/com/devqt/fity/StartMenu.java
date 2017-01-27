package com.devqt.fity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CalendarView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class StartMenu extends AppCompatActivity {


    RelativeLayout r_cal;
    CalendarView calendar;

    @SuppressLint({"NewApi", "NewApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_menu);

    }


        public void initializeCalendar () {
            calendar = (CalendarView) findViewById(R.id.calendar);


            calendar.setShowWeekNumber(false);


            calendar.setFirstDayOfWeek(2);


            calendar.setSelectedWeekBackgroundColor(getResources().getColor(R.color.green));


            calendar.setUnfocusedMonthDateColor(getResources().getColor(R.color.transparent));


            calendar.setWeekSeparatorLineColor(getResources().getColor(R.color.transparent));


            calendar.setSelectedDateVerticalBar(R.color.darkgreen);


            calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

                @Override
                public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                    Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
                }
            });


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

        }



    }
