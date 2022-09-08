package com.example.myapplication;

import java.io.Serializable;

public class Picnic implements Serializable {

    private int picnicItemImgShow;
    private String picnicItemTextShow;

    // // // // //


    public Picnic(int picnicItemImgShow, String picnicItemTextShow) {
        this.picnicItemImgShow = picnicItemImgShow;
        this.picnicItemTextShow = picnicItemTextShow;
    }

    // // // // //


    public int getPicnicItemImgShow() {
        return picnicItemImgShow;
    }

    public void setPicnicItemImgShow(int picnicItemImgShow) {
        this.picnicItemImgShow = picnicItemImgShow;
    }

    public String getPicnicItemTextShow() {
        return picnicItemTextShow;
    }

    public void setPicnicItemTextShow(String picnicItemTextShow) {
        this.picnicItemTextShow = picnicItemTextShow;
    }
}
