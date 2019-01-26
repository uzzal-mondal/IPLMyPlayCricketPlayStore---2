package com.example.uzzal.ipl2019livemathschedulefixture;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridLayout mainGrid;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textGrid_id);


        tv.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tv.setText("Indian Premier League - 2019");
        tv.setSelected(true);
        tv.setSingleLine(true);


        mainGrid = (GridLayout) findViewById(R.id.gridlayoutMain_id);

        //set event to add to item
        setSingleEvent(mainGrid);




    }

    public void setSingleEvent(GridLayout mainGrid) {

        //Loop all the child item main Grid..

        for (int i = 0; i < mainGrid.getChildCount(); i++) {


            // you can see all item cardview so,so we just cost obeject  to cardview
            CardView cardView = (CardView) mainGrid.getChildAt(i);

            final int finalPos = i;

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (finalPos == 0) // open activity One, with 0 num of Position

                    {

                        Intent intent = new Intent(MainActivity.this, TeamSquadActiviy.class);
                        startActivity(intent);
                    } else if (finalPos == 1) // open activity One, with 1 num of Position

                    {

                        Intent intent = new Intent(MainActivity.this, MatchScheduleActivity.class);
                        startActivity(intent);
                    } else if (finalPos == 2) // open activity One, with 2 num of Position

                    {

                        Intent intent = new Intent(MainActivity.this, StadiumActivity.class);
                        startActivity(intent);
                    } else if (finalPos == 3) // open activity One, with 3 num of Position

                    {

                        Intent intent = new Intent(MainActivity.this, LiveScoreActivity.class);
                        startActivity(intent);
                    } else if (finalPos == 4) // open activity One, with 4 num of Position

                    {

                        Intent intent = new Intent(MainActivity.this, RecordActivity.class);
                        startActivity(intent);
                    } else if (finalPos == 5) // open activity One, with 5 num of Position

                    {

                        Intent intent = new Intent(MainActivity.this, WinnerActivity.class);
                        startActivity(intent);
                    } else if (finalPos == 6) // open activity One, with 6 num of Position

                    {
                        //sharing to create in a app..
                        Intent share = new Intent(Intent.ACTION_SEND);

                        // this is the get appLink in the play store without launching in your app.
                        final String appPackageName = getApplicationContext().getPackageName();

                        String strAppLink = "";

                        try {
                            strAppLink = "https://play.google.com/store/apps/details?id=com.ipl2019livemathschedulefixture" + appPackageName;
                        } catch (android.content.ActivityNotFoundException anfe) {
                            strAppLink = "https://play.google.com/store/apps/details?id=com.ipl2019livemathschedulefixture" + appPackageName;
                        }

                        //this is the sharing part

                        share.setType("text/plain");
                        String shareBody = "It is very amazing application where you can get\n IPl Match Schedule fixtures Live Score,\n Recent match, latest news, Schedule,\n Series, Gallery, Cricket Highlights....\n" +
                                "https://play.google.com/store/apps/details?id=com.ipl2019livemathschedulefixture";


                        String shareSub = "https://play.google.com/store/apps/details?id=com.ipl2019livemathschedulefixture";
                        share.putExtra(Intent.EXTRA_TEXT, shareBody);
                        share.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                        startActivity(Intent.createChooser(share, "Share Using"));


                        /*Intent share = new Intent(Intent.ACTION_SEND);
                        share.setType("text/plain");
                        String shareBody = "ipl2019livemathschedulefixture";
                        String shareSub = "ipl2019livemathschedulefixture";
                        share.putExtra(Intent.EXTRA_TEXT,shareBody);
                        share.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                        startActivity(Intent.createChooser(share,"Share Using"));*/
                    } else {


                        try {

                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("market://details?id=" + "com.example.uzzal.ipl2019livemathschedulefixture")));


                        } catch (ActivityNotFoundException e) {

                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://play.google.com.example.uzzal.ipl2019livemathschedulefixture=" + getPackageName())));

                        }


                    }


                }
            });

        }

    }

    // aleret daialog add to the code.....!
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.small);
        builder.setTitle("IPL - 2019");
        builder.setMessage("Do you want to Exit ? ");
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });

//        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//                dialog.cancel();
//            }
//        });

        builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });




        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Intertialshow
        // Intertialshow();

    }



}





