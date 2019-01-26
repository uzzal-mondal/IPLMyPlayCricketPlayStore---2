package com.example.uzzal.ipl2019livemathschedulefixture;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MatchScheduleActivity extends AppCompatActivity {

    private TextView textTimerDay,textTimerHour, textTimerMiunte,textTimerSecond,marquText;

    private TextView setTvEvent;

    private TextView tv;

    private Handler handler;
    private Runnable runnable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_schedule);


        // add to actionbar setting
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Match Schedule");


             // findview by id then creator to time..
        marquText = (TextView) findViewById(R.id.textViewMarquee_id);

        textTimerDay = (TextView) findViewById(R.id.textTimerDay_id);
        textTimerHour = (TextView) findViewById(R.id.textTimerHour_id);
        textTimerMiunte = (TextView) findViewById(R.id.textTimerMinute_id);
        textTimerSecond = (TextView) findViewById(R.id.textTimerSecond_id);


        // marque add to textt...in android studio.....
        marquText.setSelected(true);


        // color code in all text in a submit heree..

        //1. chennai.
//        tv = findViewById(R.id.textChennai_id);
//        String text = "Chennai Super Kings\n  VS\n Sunrise Hydarabad";
//        SpannableString ss = new SpannableString(text);
//        ForegroundColorSpan fs = new ForegroundColorSpan(Color.RED);
//        ss.setSpan(fs,22,25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        tv.setText(ss);










        //method create to count down start
        countDownStart();
    }

    public void  countDownStart(){


        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {

                handler.postDelayed(this,100);

                try{

                    //date
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    // Please here set your event date//YYYY-MM-DD

                    Date futureDate = dateFormat.parse("2019-03-23");
                    Date currentDate = new Date();



                    if (!currentDate.after(futureDate)) {

                        long diff = futureDate.getTime()
                                - currentDate.getTime();

                        //days
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);

                        //hours
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);

                        //long minutes then long second
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;


                        textTimerDay.setText("" + String.format("%02d", days));
                        textTimerHour.setText("" + String.format("%02d", hours));
                        textTimerMiunte.setText("" + String.format("%02d", minutes));
                        textTimerSecond.setText("" + String.format("%02d", seconds));


                    }else {

                        setTvEvent.setVisibility(View.VISIBLE);
                        setTvEvent.setText("The Even is Started now ");
                        textViewGone();
                    }





                }catch (Exception e){

                    e.printStackTrace();

                }

            }

        };

        handler.postDelayed(runnable, 1*1000);


    }

    public void  textViewGone(){

         findViewById(R.id.linearLayout10_id).setVisibility(View.GONE);
         findViewById(R.id.linearLayout11_Id).setVisibility(View.GONE);
         findViewById(R.id.linearLayout12_Id).setVisibility(View.GONE);
         findViewById(R.id.linearLayout13_Id).setVisibility(View.GONE);

         //findViewById(R.id.textViewMarquee_id).setVisibility(View.GONE);
        // findViewById(R.id.text2_id).setVisibility(View.GONE);

    }
}
