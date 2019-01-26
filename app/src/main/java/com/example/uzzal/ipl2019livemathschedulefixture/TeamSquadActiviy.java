package com.example.uzzal.ipl2019livemathschedulefixture;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class TeamSquadActiviy extends AppCompatActivity {

    /* 1. List view create to team activity  with find view by id Main Activity**..
    2.team row xml create & Design,ami Jete view korte chai custom list view akare** Important..
    3.Adding menu to search view Action bar.
    4. Add to model class.
    5.Add adapter to class.
    6.image and text data get in adapter
    7. Searchview add.
    8.searchview and list view test to project
    9. ok, that's working now well handle item click to move to factivity actiion bar title and
    some  data..

    10.change actionbar title of both activities
    11. add back button to action bar in manifest parent activity..
    12. handle item click's.



     */


    private ListView listView;
    TeamListViewAdapter adapter;

    String [] title;
    String [] description;
    int[] image;
    ArrayList<TeamModel> arrayList =  new ArrayList<TeamModel>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_squad_activiy);

        // add to actionbar setting
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("IPL Team List");


        //all data collected here in place.
        title = new String[]{"Sunrisers Hyderabad","Chennai Super Kings","Kolkata Knight Riders","Rajasthan Royals",
                "Mumbai Indians","Royal Challengers","Kings XI Punjab","Delhi Daredevils"};

        description = new String[]{"IPL 2019 Latest News","IPL 2019 Latest News",
                "IPL 2019 Latest News","IPL 2019 Latest News","IPL 2019 Latest News",
                "IPL 2019 Latest News", "IPL 2019 Latest News ",
                "IPL 2019 Latest News"};

        image = new int[]{R.drawable.sunrisesarif,R.drawable.chennaymainimage2,R.drawable.kolkataarif,
        R.drawable.rajsthanarif,R.drawable.mumbaiarif,R.drawable.royalarif,R.drawable.kingarif,R.drawable.dellhiarif};


        // find this listview id..
        listView =(ListView) findViewById(R.id.listView_id);


        for (int i=0; i<title.length; i++){

            TeamModel model = new TeamModel(title[i],description[i],image[i]);

            //bind all strings in an array
            arrayList.add(model);
        }
        //pass result to list view adapter class..
        adapter = new TeamListViewAdapter(this,arrayList);

        //bind the adapter to the list view
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        android.support.v7.widget.SearchView searchView = (android.support.v7.widget.SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                if (TextUtils.isEmpty(s)) {

                    adapter.filter("");
                    listView.clearTextFilter();
                } else {

                    adapter.filter(s);
                }
                return true;
            }
        });


        return true;



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id==R.id.action_setting){

            //do you functionality here..
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
