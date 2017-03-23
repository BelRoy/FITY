package com.devqt.fity.days_b.informat_b_f;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.devqt.fity.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ChtBFirstInf extends AppCompatActivity{

    String _URL = "https://docs.google.com/spreadsheets/d/1Q-AJIbIqWg1jOqtQLDELfXEx3Ktx5Drfk8SixDvykT4/pubhtml?gid=0&amp;single=true&amp;widget=false&amp;headers=false&amp;chrome=false";
    TextView textView, names_para, name_2, name_para_2;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chetverg_inf_fcr);
        textView = (TextView)findViewById(R.id.numbers);
        names_para = (TextView)findViewById(R.id.names_p);
        name_2 = (TextView)findViewById(R.id.name_2);
        name_para_2 = (TextView)findViewById(R.id.name_para_2);
        new _JSOUP().execute();
    }


    public class _JSOUP extends AsyncTask<Void, Void, Void> {

        ProgressDialog dialog;
        String PARA = "";
        String NAME = "";
        String PARA_S = "";
        String NAME_S = "";


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(ChtBFirstInf.this);
            dialog.setMessage("Loading...");
            dialog.show();
        }


        @Override
        protected Void doInBackground(Void... params) {
            try {

                Document document = Jsoup.connect(_URL).get();
                Elements elements = document.select("td.s0");
                for (int i=0; i<elements.size(); i++) {
                    PARA += "\n" + elements.get(i).text();
                }

                Elements elements2 = document.select("td.s1");
                for (int i=0; i<elements2.size(); i++) {
                    NAME += "\n" + elements2.get(i).text();
                }


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
            textView.setText("" + PARA);
            names_para.setText("" + NAME);
            name_2.setText("" + PARA_S);
            name_para_2.setText("" + NAME_S);
        }
    }


}
