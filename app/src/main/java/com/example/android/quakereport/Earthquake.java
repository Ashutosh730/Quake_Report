package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {

    private String mag;
    private String location,date;

    public Earthquake(String mag, String location, String date) {
        this.mag = mag;
        this.location = location;
        this.date = date;
    }

    public String getMag() {
        return mag;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        long timeInMilliseconds = Long.parseLong(date);
        Date dateObject = new Date(timeInMilliseconds);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormatter.format(dateObject);
        return dateToDisplay;
    }
}
