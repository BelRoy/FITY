package com.devqt.fity.days_b.informat_b_f;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.devqt.fity.R;
import com.devqt.fity.fragments_b.FirstGroupInfBF;
import com.devqt.fity.fragments_b.SecondGroupInfBF;

public class PnBFirstInf extends TabActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ponedelnik_inf_fcr);
        TabHost tabHost = getTabHost();


        TabHost.TabSpec fgroupspec = tabHost.newTabSpec("1 група");
        fgroupspec.setIndicator("1 група");
        Intent fgroupsIntent = new Intent(this,FirstGroupInfBF.class);
        fgroupspec.setContent(fgroupsIntent);


        TabHost.TabSpec sgroupspec = tabHost.newTabSpec("2 група");
        sgroupspec.setIndicator("2 група");
        Intent sgroupsIntent = new Intent(this,SecondGroupInfBF.class);
        sgroupspec.setContent(sgroupsIntent);

        tabHost.addTab(fgroupspec);
        tabHost.addTab(sgroupspec);


    }


}


