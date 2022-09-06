package com.example.myapplication;

import java.io.Serializable;

public class Bags implements Serializable {

    private int bagImg;
    private String bagType;

    // // // // //


    public Bags(int bagImg, String bagType) {
        this.bagImg = bagImg;
        this.bagType = bagType;
    }

    // // // // //


    public int getBagImg() {
        return bagImg;
    }

    public void setBagImg(int bagImg) {
        this.bagImg = bagImg;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }
}
