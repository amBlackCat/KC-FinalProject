package com.example.myapplication;

public class Baby {

    private int babyItemImgShow;
    private String babyItemTextShow;

    // // // // //


    public Baby(int babyItemImgShow, String babyItemTextShow) {
        this.babyItemImgShow = babyItemImgShow;
        this.babyItemTextShow = babyItemTextShow;
    }

    // // // // //


    public int getBabyItemImgShow() {
        return babyItemImgShow;
    }

    public void setBabyItemImgShow(int babyItemImgShow) {
        this.babyItemImgShow = babyItemImgShow;
    }

    public String getBabyItemTextShow() {
        return babyItemTextShow;
    }

    public void setBabyItemTextShow(String babyItemTextShow) {
        this.babyItemTextShow = babyItemTextShow;
    }

}
