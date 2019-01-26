package com.example.uzzal.ipl2019livemathschedulefixture;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    //private Button bouncebutton;
    private TextView textnotetv;
    private Chronometer chronometer;
    private ProgressBar progressBar;

    int progress;

    //new
    ImageView imageViewSplash;
    Thread splashThread;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.activity_splash);


        setContentView(R.layout.activity_splash);

        imageViewSplash = (ImageView) findViewById(R.id.img_logoSplash_id);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout_id);
        // bouncebutton = findViewById(R.id.bounce_button_id);
        textnotetv = (TextView) findViewById(R.id.textIpl_id);

        progressBar = (ProgressBar) findViewById(R.id.progressBar1);


//        chronometer = (Chronometer) findViewById(R.id.choronomiter_id);
//        chronometer.setBase(SystemClock.elapsedRealtime());
//        chronometer.start();


        startAnim();


    }

    private void startAnim() {

        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation transelete = AnimationUtils.loadAnimation(this, R.anim.translate);

        rotate.reset();
        transelete.reset();
        relativeLayout.clearAnimation();

        imageViewSplash.startAnimation(rotate);
        textnotetv.startAnimation(transelete);


        splashThread = new Thread() {

            @Override
            public void run() {
                super.run();

                int watied = 10;
                while (watied < 2300) {
                    try {
                        sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    watied += 200;
                }
                SplashActivity.this.finish();

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        };

        splashThread.start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                proWork();
            }
        });
        thread.start();

    }

    public void proWork() {


        for (progress = 40; progress <= 100; progress = progress + 20) {

            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
