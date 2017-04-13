package com.devqt.fity.fragments_b;


import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import com.devqt.fity.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SecondGroupInfBF extends Activity {

    String _URL = "https://docs.google.com/spreadsheets/d/1NemrdvOYqcJ2p9Wwq_ReMpbtUBy25t9vhl_svfznzME/pubhtml?gid=0&single=true&widget=false&headers=false&chrome=false";
    TextView name_2, name_para_2;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_s_group);
        name_2 = (TextView)findViewById(R.id.name_2);
        name_para_2 = (TextView)findViewById(R.id.name_para_2);
        new _JSOUP().execute();

    }
    public class _JSOUP extends AsyncTask<Void, Void, Void> {

        ProgressDialog dialog;

        String PARA_S = "";
        String NAME_S = "";


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(SecondGroupInfBF.this);
            dialog.setMessage("Loading...");
            dialog.show();
        }


        @Override
        protected Void doInBackground(Void... params) {
            try {

                Document document = Jsoup.connect(_URL).get();
                Elements elements3 = document.select("td.s3");
                for (int i=0; i<elements3.size(); i++) {
                    PARA_S += "\n" + elements3.get(i).text();
                }

                Elements elements4 = document.select("td.s4");
                for (int i=0; i<elements4.size(); i++) {
                    NAME_S += "\n" + elements4.get(i).text();

                }
            }
            catch (Exception e) {

            }
            return null;

        }


        @Override
        protected void onPostExecute (Void result){
            super.onPostExecute(result);
            dialog.dismiss();
            name_2.setText("" + PARA_S);
            name_para_2.setText("" + NAME_S);
        }
    }


}