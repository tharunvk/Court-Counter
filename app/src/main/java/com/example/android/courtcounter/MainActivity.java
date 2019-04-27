package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scorea=0,scoreb=0;

    public void inc1a(View view){
        scorea+=3;
        dispa(view);

    }
    public void inc2a(View view){
        scorea+=2;
        dispa(view);
    }
    public void inc3a(View view){
        scorea+=1;
        dispa(view);
    }
    public void inc1b(View view){
        scoreb+=3;
        dispb(view);
    }
    public void inc2b(View view){
        scoreb+=2;
        dispb(view);
    }
    public void inc3b(View view){
        scoreb+=1;
        dispb(view);
    }
    public void refresh(View view){
        TextView message=(TextView) findViewById(R.id.teama_id);
        message.setText(""+0);
        TextView message1=(TextView) findViewById(R.id.teamb_id);
        message1.setText(""+0);
        scoreb=0;
        scorea=0;

    }
    public void dispa(View view){
        TextView message=(TextView) findViewById(R.id.teama_id);
        message.setText(""+scorea);
    }
    public void dispb(View view){
        TextView message=(TextView) findViewById(R.id.teamb_id);
        message.setText(""+scoreb);
    }
}
