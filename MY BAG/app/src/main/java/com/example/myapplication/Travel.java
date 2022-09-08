package com.example.myapplication;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Travel implements Serializable {


    private int travelItemImgShow;
    private String travelItemTextShow;

    // // // // //

    public Travel(int travelItemImgShow, String travelItemTextShow) {
        this.travelItemImgShow = travelItemImgShow;
        this.travelItemTextShow = travelItemTextShow;
    }

    // // // // //


    public int getTravelItemImgShow() {
        return travelItemImgShow;
    }

    public void setTravelItemImgShow(int travelItemImgShow) {
        this.travelItemImgShow = travelItemImgShow;
    }

    public String getTravelItemTextShow() {
        return travelItemTextShow;
    }

    public void setTravelItemTextShow(String travelItemTextShow) {
        this.travelItemTextShow = travelItemTextShow;
    }
}



