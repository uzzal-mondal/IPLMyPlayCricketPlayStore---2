package com.example.uzzal.ipl2019livemathschedulefixture;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TeamListViewAdapter extends BaseAdapter {

    //variables
    LayoutInflater inflater;
    Context mContext;

    List<TeamModel> modelList;
    ArrayList<TeamModel> arrayList;

    //constructor


    public TeamListViewAdapter(Context context, List<TeamModel> modelList) {
         mContext = context;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<TeamModel>();
        this.arrayList.addAll(modelList);

    }

    public class ViewHolder{

        TextView mTitleTv, mDescTv;
        ImageView mIconIv;


    }



    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder  holder;

        if(convertView==null){

            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.teamsquad_c_list_row,null);

            //locate the views in row xml..
            holder.mTitleTv = convertView.findViewById(R.id.textMainTeamSquadRow_title_id);
            holder.mDescTv = convertView.findViewById(R.id.textMainTeamSquadRow_discrip_id);
            holder.mIconIv = convertView.findViewById(R.id.imageMainTeamSquadRow_id);

            convertView.setTag(holder);
        }else {

            holder = (ViewHolder) convertView.getTag();
        }

        // set the result into textViews;
        holder.mTitleTv.setText(modelList.get(position).getTitle());
        holder.mDescTv.setText(modelList.get(position).getDesc());

        //set the result in image view
        holder.mIconIv.setImageResource(modelList.get(position).getIcon());


        //listview item click
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 // code later in click able item position

                if(modelList.get(position).getTitle().equals("Sunrisers Hyderabad")){
                     // start Team player name show activity with title for action bar and text for textview

                    Intent intent = new Intent(mContext,TeamPlayerNameShowActivity.class);
                    intent.putExtra("actionBarTitle","Sunrisers Hyderabad");
                    //intent.putExtra("contentTv","This is sunrise player name");
                    mContext.startActivity(intent);


                }


                if(modelList.get(position).getTitle().equals("Chennai Super Kings")){
                    // start Team player name show activity with title for action bar and text for textview

                    Intent intent = new Intent(mContext,TeamPlayerNameShowActivity.class);
                    intent.putExtra("actionBarTitle","Chennai Super Kings");
                    intent.putExtra("contentTv","This is chennai player name");
                    mContext.startActivity(intent);


                }


                if(modelList.get(position).getTitle().equals("Kolkata Knight Riders")){
                    // start Team player name show activity with title for action bar and text for textview

                    Intent intent = new Intent(mContext,TeamPlayerNameShowActivity.class);
                    intent.putExtra("actionBarTitle","Kolkata Knight Riders");
                    intent.putExtra("contentTv","This is kolkata player name");
                    mContext.startActivity(intent);


                }


                if(modelList.get(position).getTitle().equals("Rajasthan Royals")){
                    // start Team player name show activity with title for action bar and text for textview

                    Intent intent = new Intent(mContext,TeamPlayerNameShowActivity.class);
                    intent.putExtra("actionBarTitle","Rajasthan Royals");
                    intent.putExtra("contentTv","This is rajasthan player name");
                    mContext.startActivity(intent);


                }


                if(modelList.get(position).getTitle().equals("Mumbai Indians")){
                    // start Team player name show activity with title for action bar and text for textview

                    Intent intent = new Intent(mContext,TeamPlayerNameShowActivity.class);
                    intent.putExtra("actionBarTitle","Mumbai Indians");
                    intent.putExtra("contentTv","This is mumbai player name");
                    mContext.startActivity(intent);


                }


                if(modelList.get(position).getTitle().equals("Royal Challengers")){
                    // start Team player name show activity with title for action bar and text for textview

                    Intent intent = new Intent(mContext,TeamPlayerNameShowActivity.class);
                    intent.putExtra("actionBarTitle","Royal Challengers");
                    intent.putExtra("contentTv","This is royal player name");
                    mContext.startActivity(intent);


                }


                if(modelList.get(position).getTitle().equals("Kings XI Punjab")){
                    // start Team player name show activity with title for action bar and text for textview

                    Intent intent = new Intent(mContext,TeamPlayerNameShowActivity.class);
                    intent.putExtra("actionBarTitle","Kings XI Punjab");
                    intent.putExtra("contentTv","This is kings player name");
                    mContext.startActivity(intent);


                }


                if(modelList.get(position).getTitle().equals("Delhi Daredevils")){
                    // start Team player name show activity with title for action bar and text for textview

                    Intent intent = new Intent(mContext,TeamPlayerNameShowActivity.class);
                    intent.putExtra("actionBarTitle","Delhi Daredevils");
                    intent.putExtra("contentTv","This is delhi player name");
                    mContext.startActivity(intent);


                }

            }
        });




        return convertView;
    }


    //filter
    public void filter(String charText){

        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if(charText.length()==0){
            modelList.addAll(arrayList);
        }

        else {
            for (TeamModel model : arrayList){

                if(model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){

                    modelList.add(model);
                }

            }
        }

        notifyDataSetChanged();
    }


}
