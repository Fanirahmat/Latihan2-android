package com.dasar_android.windows10.lat_1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v7.widget.CardView;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    private TextView Result1;
    private TextView Result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Result1 = (TextView) findViewById(R.id.username);
        Result2 = (TextView) findViewById(R.id.password);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //getdata
        if(getIntent().getExtras() != null ){
            String data1 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            Result1.setText(data1);
            String data2 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA2);
            Result2.setText(data2);
        }
    }
}
