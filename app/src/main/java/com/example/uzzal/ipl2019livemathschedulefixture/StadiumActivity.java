package com.example.uzzal.ipl2019livemathschedulefixture;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StadiumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium);

        // add to actionbar setting
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Best Stadium");
    }
}
