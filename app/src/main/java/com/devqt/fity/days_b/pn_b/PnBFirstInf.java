package com.devqt.fity.days_b.pn_b;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.devqt.fity.R;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class PnBFirstInf extends AppCompatActivity{


    TextView frst_b_inf_para;
    Firebase mRef;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ponedelnik_inf_fcr);
        Firebase.setAndroidContext(this);


        frst_b_inf_para = (TextView) findViewById(R.id.frst_b_inf_para);
        mRef = new Firebase("https://fity-4c21f.firebaseio.com/para/first_p");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String first_p = (String) dataSnapshot.getValue();
                frst_b_inf_para.setText(first_p);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


    }

}
