package com.example.myapplication;

import java.io.Serializable;

public class Days implements Serializable {

    private String day;

    // // // // //


    public Days(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
