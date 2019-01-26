package com.example.uzzal.ipl2019livemathschedulefixture;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TeamPlayerNameShowActivity extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,
            imageView8,imageView9,imageView10, imageView11,imageView12,imageView13,
    imageView14,imageView15,imageView16,imageView17,imageView18,imageView19,imageView20,imageView21,
            imageView22,imageView23,imageView24;

    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,
            textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,
            textView20,textView21,textView22,textView23,textView24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_player_name_show);

       // find view id and image and text..
        imageView1 = (ImageView) findViewById(R.id.image1_id);
        imageView2 = (ImageView) findViewById(R.id.image2_id);
        imageView3 = (ImageView) findViewById(R.id.image3_id);
        imageView4 = (ImageView) findViewById(R.id.image4_id);
        imageView5 = (ImageView) findViewById(R.id.image5_id);
        imageView6 = (ImageView) findViewById(R.id.image6_id);
        imageView7 = (ImageView) findViewById(R.id.image7_id);
        imageView8 = (ImageView) findViewById(R.id.image8_id);
        imageView9 = (ImageView) findViewById(R.id.image9_id);
        imageView10 = (ImageView) findViewById(R.id.image10_id);
        imageView11 = (ImageView) findViewById(R.id.image11_id);
        imageView12 = (ImageView) findViewById(R.id.image12_id);
        imageView13 = (ImageView) findViewById(R.id.image13_id);
        imageView14 = (ImageView) findViewById(R.id.image14_id);
        imageView15 = (ImageView) findViewById(R.id.image15_id);
        imageView16 = (ImageView) findViewById(R.id.image16_id);
        imageView17 = (ImageView) findViewById(R.id.image17_id);
        imageView18 = (ImageView) findViewById(R.id.image18_id);
        imageView19 = (ImageView) findViewById(R.id.image19_id);
        imageView20 = (ImageView) findViewById(R.id.image20_id);
        imageView21 = (ImageView) findViewById(R.id.image21_id);
        imageView22 = (ImageView) findViewById(R.id.image22_id);
        imageView23 = (ImageView) findViewById(R.id.image23_id);
        imageView24 = (ImageView) findViewById(R.id.image24_id);

        // find to text view in android project.....


        textView1 = (TextView) findViewById(R.id.text1_id);
        textView2 = (TextView) findViewById(R.id.text2_id);
        textView3 = (TextView) findViewById(R.id.text3_id);
        textView4 = (TextView) findViewById(R.id.text4_id);
        textView5 = (TextView) findViewById(R.id.text5_id);
        textView6 = (TextView) findViewById(R.id.text6_id);
        textView7 = (TextView) findViewById(R.id.text7_id);
        textView8 = (TextView) findViewById(R.id.text8_id);
        textView9 = (TextView) findViewById(R.id.text9_id);
        textView10 = (TextView) findViewById(R.id.text10_id);
        textView11 = (TextView) findViewById(R.id.text11_id);
        textView12 = (TextView) findViewById(R.id.text12_id);
        textView13 = (TextView) findViewById(R.id.text13_id);
        textView14 = (TextView) findViewById(R.id.text14_id);
        textView15 = (TextView) findViewById(R.id.text15_id);
        textView16 = (TextView) findViewById(R.id.text16_id);
        textView17 = (TextView) findViewById(R.id.text17_id);
        textView18 = (TextView) findViewById(R.id.text18_id);
        textView19 = (TextView) findViewById(R.id.text19_id);
        textView20 = (TextView) findViewById(R.id.text20_id);
        textView21 = (TextView) findViewById(R.id.text21_id);
        textView22 = (TextView) findViewById(R.id.text22_id);
        textView23 = (TextView) findViewById(R.id.text23_id);
        textView24 = (TextView) findViewById(R.id.text24_id);


        //get data from previously activity when item of listview is clicked of using intent.
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set action bar title
       ActionBar actionBar = getSupportActionBar();
       actionBar.setTitle(mActionBarTitle);


       // bundle check and show all item data ..

       Bundle bundle = getIntent().getExtras();
       if(bundle!=null){

           String playershow = bundle.getString("actionBarTitle");

           //method create list view differ data collect
           showDetails(playershow);
       }



    }
         // method done create
    void showDetails (String playershow ){

           // postion check and show data in project
       if(playershow.equals("Sunrisers Hyderabad")){


           //image view

           imageView1.setImageResource(R.drawable.david1);
           imageView2.setImageResource(R.drawable.bhuvneshwar2);
           imageView3.setImageResource(R.drawable.rashid3);
           imageView4.setImageResource(R.drawable.deepak4);
           imageView5.setImageResource(R.drawable.ricky5);
           imageView6.setImageResource(R.drawable.manish6);
           imageView7.setImageResource(R.drawable.kane7);
           imageView8.setImageResource(R.drawable.yusuf8);
           imageView9.setImageResource(R.drawable.shakib9);
           imageView10.setImageResource(R.drawable.billy10);
           imageView11.setImageResource(R.drawable.sandeepp11);
           imageView12.setImageResource(R.drawable.khaleel12);
           imageView13.setImageResource(R.drawable.siddarth13);
           imageView14.setImageResource(R.drawable.tnatarajan14);
           imageView15.setImageResource(R.drawable.basil15);
           imageView16.setImageResource(R.drawable.mohammad16);
           imageView17.setImageResource(R.drawable.shreevats17);
           imageView18.setImageResource(R.drawable.wriddhiman18);
           imageView19.setImageResource(R.drawable.martin19);
           imageView20.setImageResource(R.drawable.abhishek20);
           imageView21.setImageResource(R.drawable.vijay21);
           imageView22.setImageResource(R.drawable.shahbaz222);
           imageView23.setImageResource(R.drawable.jonny23);
           imageView24.setImageResource(R.drawable.hhaa24);







           // text view
           textView1.setText(R.string.Davidd);
           textView2.setText(R.string.Bhuvneshwar );
           textView3.setText(R.string.Rashid  );
           textView4.setText(R.string.Deepakk  );
           textView5.setText(R.string.Ricky  );
           textView6.setText(R.string.Manish  );
           textView7.setText(R.string.Kane  );
           textView8.setText(R.string.Yusuf  );
           textView9.setText(R.string.Shakib  );
           textView10.setText(R.string.Billy  );
           textView11.setText(R.string.Sandeepp  );
           textView12.setText(R.string.Khaleel  );
           textView13.setText(R.string.Siddarth  );
           textView14.setText(R.string.T );
           textView15.setText(R.string.Basil  );
           textView16.setText(R.string.Mohammad  );
           textView17.setText(R.string.Shreevats  );
           textView18.setText(R.string.Wriddhiman  );
           textView19.setText(R.string.Martin  );
           textView20.setText(R.string.Abhishek  );
           textView21.setText(R.string.Vijay  );
           textView22.setText(R.string.Shahbaz  );
           textView23.setText(R.string.Jonny  );

       }









        if(playershow.equals("Chennai Super Kings")){

           imageView1.setImageResource(R.drawable.dhoni1);
           imageView2.setImageResource(R.drawable.suresh2);
           imageView3.setImageResource(R.drawable.ravindra3);
           imageView4.setImageResource(R.drawable.duplisies4);
           imageView5.setImageResource(R.drawable.bravo5);
           imageView6.setImageResource(R.drawable.bishnoi6);
           imageView7.setImageResource(R.drawable.dhruv77);
           imageView8.setImageResource(R.drawable.vijay7);
           imageView9.setImageResource(R.drawable.kedar9);
           imageView10.setImageResource(R.drawable.shane10);
           imageView11.setImageResource(R.drawable.harbajhan11);
           imageView12.setImageResource(R.drawable.deepak12);
           imageView13.setImageResource(R.drawable.lungisani13);
           imageView14.setImageResource(R.drawable.monu14);
           imageView15.setImageResource(R.drawable.shardul15);
           imageView16.setImageResource(R.drawable.kmasif16);
           imageView17.setImageResource(R.drawable.tahir17);
           imageView18.setImageResource(R.drawable.mitchell18);
           imageView19.setImageResource(R.drawable.karn19);
           imageView20.setImageResource(R.drawable.njagadeesan20);
           imageView21.setImageResource(R.drawable.ambati21);
           imageView22.setImageResource(R.drawable.sambllings22);
           imageView23.setImageResource(R.drawable.ruturaj23);
           imageView24.setImageResource(R.drawable.mohit24);

           // text view set to player identify

            textView1.setText(R.string.MS);
            textView2.setText(R.string.Suresh );
            textView3.setText(R.string.Ravindra );
            textView4.setText(R.string.Faf );
            textView5.setText(R.string.Dwayne );
            textView6.setText(R.string.Chaitanya );
            textView7.setText(R.string.Dhruv );
            textView8.setText(R.string.Murali );
            textView9.setText(R.string.Kedar );
            textView10.setText(R.string.Shane );
            textView11.setText(R.string.Harbhajan );
            textView12.setText(R.string.Deepak );
            textView13.setText(R.string.Lungisani );
            textView14.setText(R.string.Monu );
            textView15.setText(R.string.Shardul );
            textView16.setText(R.string.KM );
            textView17.setText(R.string.Imran );
            textView18.setText(R.string.Mitchell );
            textView19.setText(R.string.Karn );
            textView20.setText(R.string.N );
            textView21.setText(R.string.Ambati );
            textView22.setText(R.string.Sam );
            textView23.setText(R.string.Ruturaj );
            textView24.setText(R.string.Mohit );

        }

        if(playershow.equals("Kolkata Knight Riders")){

            imageView1.setImageResource(R.drawable.andre1);
            imageView2.setImageResource(R.drawable.sunil2);
            imageView3.setImageResource(R.drawable.kuldeep3);
            imageView4.setImageResource(R.drawable.piyush4);
            imageView5.setImageResource(R.drawable.robin5);
            imageView6.setImageResource(R.drawable.nitish6);
            imageView7.setImageResource(R.drawable.shubman7);
            imageView8.setImageResource(R.drawable.rinkusingh8);
            imageView9.setImageResource(R.drawable.chris9);
            imageView10.setImageResource(R.drawable.kamlesh10);
            imageView11.setImageResource(R.drawable.shivamm11);
            imageView12.setImageResource(R.drawable.dinesh12);
            imageView13.setImageResource(R.drawable.nikhil13);
            imageView14.setImageResource(R.drawable.joe14);
            imageView15.setImageResource(R.drawable.shrikant15);
            imageView16.setImageResource(R.drawable.anrich16);
            imageView17.setImageResource(R.drawable.harry16);
            imageView18.setImageResource(R.drawable.lockie17);
            imageView19.setImageResource(R.drawable.yarra18);
            imageView20.setImageResource(R.drawable.carlos19);
            imageView21.setImageResource(R.drawable.prasidh20);

            imageView22.setImageResource(R.drawable.anrich16);
            imageView23.setImageResource(R.drawable.anrich16);
            imageView24.setImageResource(R.drawable.anrich16);


            //text view find to string to data set

            textView1.setText(R.string.Andre);
            textView2.setText(R.string.Sunil );
            textView3.setText(R.string.Kuldeep );
            textView4.setText(R.string.Piyush );
            textView5.setText(R.string.Robin );
            textView6.setText(R.string.Nitish );
            textView7.setText(R.string.Shubman );
            textView8.setText(R.string.Rinku );
            textView9.setText(R.string.Chrish );
            textView10.setText(R.string.Kamlesh );
            textView11.setText(R.string.Shivamm );
            textView12.setText(R.string.Dinesh );
            textView13.setText(R.string.Nikhil );
            textView14.setText(R.string.Joe );
            textView15.setText(R.string.Shrikant );
            textView16.setText(R.string.Anrich);
            textView17.setText(R.string.Harry );
            textView18.setText(R.string.Lockie );
            textView19.setText(R.string.Yarra );
            textView20.setText(R.string.Carlos );
            textView21.setText(R.string.Prasidh );








        }

        if(playershow.equals("Rajasthan Royals")){

            imageView1.setImageResource(R.drawable.steven1);
            imageView2.setImageResource(R.drawable.ajinkya2);
            imageView3.setImageResource(R.drawable.dhawal3);
            imageView4.setImageResource(R.drawable.aryaman4);
            imageView5.setImageResource(R.drawable.rahul5);
            imageView6.setImageResource(R.drawable.stuart6);
            imageView7.setImageResource(R.drawable.mahipal7);
            imageView8.setImageResource(R.drawable.jaydev8);
            imageView9.setImageResource(R.drawable.midhun9);
            imageView10.setImageResource(R.drawable.shreyas10);
            imageView11.setImageResource(R.drawable.krishnappa11);
            imageView12.setImageResource(R.drawable.jofra12);
            imageView13.setImageResource(R.drawable.ben13);
            imageView14.setImageResource(R.drawable.jos14);
            imageView15.setImageResource(R.drawable.prashant15);
            imageView16.setImageResource(R.drawable.sanju16);
            imageView17.setImageResource(R.drawable.shashankk17);
            imageView18.setImageResource(R.drawable.riyan18);
            imageView19.setImageResource(R.drawable.liam19);
            imageView20.setImageResource(R.drawable.manan20);
            imageView21.setImageResource(R.drawable.ashton21);
            imageView22.setImageResource(R.drawable.varun22);
            imageView23.setImageResource(R.drawable.oshane23);
            imageView24.setImageResource(R.drawable.ish24);

            // text to set in player...........

            textView1.setText(R.string.Steven);
            textView2.setText(R.string.Ajinkya);
            textView3.setText(R.string.Dhawal);
            textView4.setText(R.string.Aryaman);
            textView5.setText(R.string.Rahull);
            textView6.setText(R.string.Stuart);
            textView7.setText(R.string.Mahipal);
            textView8.setText(R.string.Jaydev);
            textView9.setText(R.string.S);
            textView10.setText(R.string.Shreyass);
            textView11.setText(R.string.Krishnappa);
            textView12.setText(R.string.Jofra);
            textView13.setText(R.string.Ben);
            textView14.setText(R.string.Jos);
            textView15.setText(R.string.Prashant);
            textView16.setText(R.string.Sanju);
            textView17.setText(R.string.Shashank);
            textView18.setText(R.string.Riyan);
            textView19.setText(R.string.Liam);
            textView20.setText(R.string.Manan);
            textView21.setText(R.string.Ashton);
            textView22.setText(R.string.Varun);
            textView23.setText(R.string.Oshane);
            textView24.setText(R.string.Ish);

        }

        if(playershow.equals("Mumbai Indians")){

//image view
            imageView1.setImageResource(R.drawable.ruhit1);
            imageView2.setImageResource(R.drawable.japrit2);
            imageView3.setImageResource(R.drawable.hardik3);
            imageView4.setImageResource(R.drawable.krunal4);
            imageView5.setImageResource(R.drawable.pollard5);
            imageView6.setImageResource(R.drawable.lewis6);
            imageView7.setImageResource(R.drawable.suryakumar7);
            imageView8.setImageResource(R.drawable.siddhesh8);
            imageView9.setImageResource(R.drawable.mayank9);
            imageView10.setImageResource(R.drawable.anukul10);
            imageView11.setImageResource(R.drawable.jason11);
            imageView12.setImageResource(R.drawable.rahul12);
            imageView13.setImageResource(R.drawable.ben13);
            imageView14.setImageResource(R.drawable.aditya14);
            imageView15.setImageResource(R.drawable.ishan15);
            imageView16.setImageResource(R.drawable.rakishh16);
            imageView17.setImageResource(R.drawable.anmolpreet17);
            imageView18.setImageResource(R.drawable.yuvraj18);
            imageView19.setImageResource(R.drawable.barinder19);
            imageView20.setImageResource(R.drawable.lasith20);
            imageView21.setImageResource(R.drawable.adam21);
            imageView22.setImageResource(R.drawable.mitchell22);
            imageView23.setImageResource(R.drawable.pankaj23);
            imageView24.setImageResource(R.drawable.kock24);





            //text view
            textView1.setText(R.string.mfast_name);
            textView2.setText(R.string.msecond_name);
            textView3.setText(R.string.mthird_name);
            textView4.setText(R.string.mfour_name);
            textView5.setText(R.string.mfive_name);
            textView6.setText(R.string.msix_name);
            textView7.setText(R.string.mseven_name);
            textView8.setText(R.string.meight_name);
            textView9.setText(R.string.mnine_name);
            textView10.setText(R.string.mten_name);
            textView11.setText(R.string.meleven_name);
            textView12.setText(R.string.mtwelve_name);
            textView13.setText(R.string.mthirteen_name);
            textView14.setText(R.string.mfourteen_name);
            textView15.setText(R.string.mfifteen_name);
            textView16.setText(R.string.msixteen_name);
            textView17.setText(R.string.mseventeen_name);
            textView18.setText(R.string.meighteen_name);
            textView19.setText(R.string.mtwenty_name);
            textView20.setText(R.string.mtwentyOne_name);
            textView21.setText(R.string.mtwentyOne_name);
            textView22.setText(R.string.mtwentyTwo_name);
            textView23.setText(R.string.mtwentyThree_name);
            textView24.setText(R.string.mtwentyFour_name);

        }

        if(playershow.equals("Royal Challengers")){



            imageView1.setImageResource(R.drawable.virat1);
            imageView2.setImageResource(R.drawable.ab2);
            imageView3.setImageResource(R.drawable.yuzvenda3);
            imageView4.setImageResource(R.drawable.pawan4);
            imageView5.setImageResource(R.drawable.moeenali5);
            imageView6.setImageResource(R.drawable.colin6);
            imageView7.setImageResource(R.drawable.washington7);
            imageView8.setImageResource(R.drawable.nathan8);
            imageView9.setImageResource(R.drawable.mohammed9);
            imageView10.setImageResource(R.drawable.navdeep10);
            imageView11.setImageResource(R.drawable.kulwantt11);
            imageView12.setImageResource(R.drawable.tim12);
            imageView13.setImageResource(R.drawable.umesh13);
            imageView14.setImageResource(R.drawable.parthiv14);
            imageView15.setImageResource(R.drawable.prayas15);
            imageView16.setImageResource(R.drawable.himmat16);
            imageView17.setImageResource(R.drawable.akshdeep17);
            imageView18.setImageResource(R.drawable.shivam18);
            imageView19.setImageResource(R.drawable.devdutt19);
            imageView20.setImageResource(R.drawable.gurkeerat20);
            imageView21.setImageResource(R.drawable.shimron21);
            imageView22.setImageResource(R.drawable.milind22);
            imageView23.setImageResource(R.drawable.heinrich23);
            imageView24.setImageResource(R.drawable.marcus24);

            // text view
            textView1.setText(R.string.Virat);
            textView2.setText(R.string.AB);
            textView3.setText(R.string.Yuzvendra);
            textView4.setText(R.string.Pawan);
            textView5.setText(R.string.Moeen);
            textView6.setText(R.string.Colin);
            textView7.setText(R.string.Washington);
            textView8.setText(R.string.Nathan);
            textView9.setText(R.string.Mohammed);
            textView10.setText(R.string.Navdeep);
            textView11.setText(R.string.Kulwant);
            textView12.setText(R.string.Tim);
            textView13.setText(R.string.Umesh);
            textView14.setText(R.string.Parthiv);
            textView15.setText(R.string.Prayas);
            textView16.setText(R.string.Himmat);
            textView17.setText(R.string.Akshdeep);
            textView18.setText(R.string.Shivam);
            textView19.setText(R.string.Devdutt);
            textView20.setText(R.string.Gurkeerat);
            textView21.setText(R.string.Shimron);
            textView22.setText(R.string.Milind);
            textView23.setText(R.string.Heinrich);
            textView24.setText(R.string.Marcus);

        }


        if(playershow.equals("Kings XI Punjab")){

            imageView1.setImageResource(R.drawable.david1);
            imageView2.setImageResource(R.drawable.mayank2);
            imageView3.setImageResource(R.drawable.karun3);
            imageView4.setImageResource(R.drawable.chris4);
            imageView5.setImageResource(R.drawable.andrew5);
            imageView6.setImageResource(R.drawable.mujeeb6);
            imageView7.setImageResource(R.drawable.ravichandran7);
            imageView8.setImageResource(R.drawable.ankit8);
            imageView9.setImageResource(R.drawable.lokessh9);
            imageView10.setImageResource(R.drawable.prabh10);
            imageView11.setImageResource(R.drawable.sarfaraz11);
            imageView12.setImageResource(R.drawable.agnivesh12);
            imageView13.setImageResource(R.drawable.harpreet13);
            imageView14.setImageResource(R.drawable.moises14);
            imageView15.setImageResource(R.drawable.arshdeep15);
            imageView16.setImageResource(R.drawable.darshan16);
            imageView17.setImageResource(R.drawable.murugan17);
            imageView18.setImageResource(R.drawable.varun18);
            imageView19.setImageResource(R.drawable.hardus19);
            imageView20.setImageResource(R.drawable.mohammed20);
            imageView21.setImageResource(R.drawable.sam21);
            imageView22.setImageResource(R.drawable.nicholas22);
            imageView23.setImageResource(R.drawable.mandeep23);
            imageView24.setImageResource(R.drawable.varun18);


           //text find to xml file
            textView1.setText(R.string.Davidi);
            textView2.setText(R.string.Mayank);
            textView3.setText(R.string.Karun);
            textView4.setText(R.string.Chrisi);
            textView5.setText(R.string.Andrew);
            textView6.setText(R.string.Mujeeb);
            textView7.setText(R.string.Ravichandran);
            textView8.setText(R.string.Ankit);
            textView9.setText(R.string.Lokesh);
            textView10.setText(R.string.PrabhSimran);
            textView11.setText(R.string.Sarfaraz);
            textView12.setText(R.string.Agnivesh);
            textView13.setText(R.string.Harpreet);
            textView14.setText(R.string.Moises);
            textView15.setText(R.string.Arshdeep);
            textView16.setText(R.string.Darshan);
            textView17.setText(R.string.Murugan);
            textView18.setText(R.string.Varuni);
            textView19.setText(R.string.Hardus);
            textView20.setText(R.string.Mohammedi);
            textView21.setText(R.string.Sami);
            textView22.setText(R.string.Nicholas);
            textView23.setText(R.string.Mandeep);

        }


        if(playershow.equals("Delhi Daredevils")){

            imageView1.setImageResource(R.drawable.shreyas1);
            imageView2.setImageResource(R.drawable.shikhar2);
            imageView3.setImageResource(R.drawable.prithvi3);
            imageView4.setImageResource(R.drawable.colin4);
            imageView5.setImageResource(R.drawable.manjot5);
            imageView6.setImageResource(R.drawable.jalaj6);
            imageView7.setImageResource(R.drawable.sherfane7);
            imageView8.setImageResource(R.drawable.hanuma8);
            imageView9.setImageResource(R.drawable.colin9);
            imageView10.setImageResource(R.drawable.ishant10);
            imageView11.setImageResource(R.drawable.nathu11);
            imageView12.setImageResource(R.drawable.trent12);
            imageView13.setImageResource(R.drawable.sandeep13);
            imageView14.setImageResource(R.drawable.kagiso14);
            imageView15.setImageResource(R.drawable.amit15);
            imageView16.setImageResource(R.drawable.avesh16);
            imageView17.setImageResource(R.drawable.harshal17);
            imageView18.setImageResource(R.drawable.rahul18);
            imageView19.setImageResource(R.drawable.jayanta19);
            imageView20.setImageResource(R.drawable.bandaru20);
            imageView21.setImageResource(R.drawable.keemo21);
            imageView22.setImageResource(R.drawable.axar22);
            imageView23.setImageResource(R.drawable.chris23);
            imageView24.setImageResource(R.drawable.rishabh24);

            // text to set the resources....

            textView1.setText(R.string.Shreyas);
            textView2.setText(R.string.Shikhar);
            textView3.setText(R.string.Prithvi);
            textView4.setText(R.string.Colin);
            textView5.setText(R.string.Manjot);
            textView6.setText(R.string.Jalaj);
            textView7.setText(R.string.Sherfane);
            textView8.setText(R.string.Hanuma);
            textView9.setText(R.string.Colinn);
            textView10.setText(R.string.Ishant);
            textView11.setText(R.string.Nathu);
            textView12.setText(R.string.Trent);
            textView13.setText(R.string.Sandeep);
            textView14.setText(R.string.Kagiso);
            textView15.setText(R.string.Amit);
            textView16.setText(R.string.Avesh);
            textView17.setText(R.string.Harshal);
            textView18.setText(R.string.Rahul);
            textView19.setText(R.string.Jayant);
            textView20.setText(R.string.Bandaru);
            textView21.setText(R.string.Keemo);
            textView22.setText(R.string.Axar);
            textView23.setText(R.string.Chris);
            textView24.setText(R.string.Rishabh);



        }


    }
}
