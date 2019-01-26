package com.example.uzzal.ipl2019livemathschedulefixture;

public class TeamModel {

    String title;
    String desc;
    int icon;

    //create to constructor..


    public TeamModel(String title, String desc, int icon) {
        this.title = title;
        this.desc = desc;
        this.icon = icon;
    }

    // getter

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getIcon() {
        return this.icon;
    }
}
