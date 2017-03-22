package com.devqt.fity.days_m.mat_m_sx;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.devqt.fity.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class PnMSixMat extends AppCompatActivity {

    String _URL = "https://docs.google.com/spreadsheets/d/19wXzO09IPUDj0Ow-rTFwBLjozW1hmZi9gqyqArM1Tkg/pubhtml?gid=351269635&amp;single=true&amp;widget=false&amp;headers=false&amp;chrome=false";
    TextView textView, names_para;


    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ponedelnik_inf_fcr);
        textView = (TextView)findViewById(R.id.numbers);
        names_para = (TextView)findViewById(R.id.names_p);
        new _JSOUP().execute();
    }


    public class _JSOUP extends AsyncTask<Void, Void, Void> {

        ProgressDialog dialog;
        String PARA = "";
        String NAME = "";


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(PnMSixMat.this);
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
        }
    }


}