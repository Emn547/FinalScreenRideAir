package com.example.eladm96.finalscreenrideair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring the UI elements

        //mainMessage
        TextView mainMessage = (TextView) findViewById(R.id.mainMessage);
        //starting point
        TextView startPoint = (TextView) findViewById(R.id.startPoint);
        //destination
        TextView destination = (TextView)findViewById(R.id.destination);
        //the driver
        TextView partner = (TextView) findViewById(R.id.partner);
        //the departure time
        TextView depTime = (TextView) findViewById(R.id.depTime);




    }
}
