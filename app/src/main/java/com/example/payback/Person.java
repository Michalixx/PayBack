package com.example.payback;

import android.net.Uri;

public class Person{

    private String name;
    private float money;
    private Uri imgUri;
    private boolean isImgSet;

    public Person(String name){
        this.name = name;
        this.money = 0;
        this.isImgSet = false;
    }

    public String getName(){
        return this.name;
    }

    public String getMoney(){
        return Float.toString(this.money);
    }

    public void setMoney(float money){
        this.money = money;
    }

    public void addMoney(float money){
        this.money += money;
    }

    public void subMoney(float money){
        this.money -= money;
    }

    public void setImg(Uri img){
        this.imgUri = img;
        this.isImgSet = true;
    }

    public boolean isImgSet(){
        return this.isImgSet;
    }

    public Uri getImg(){
        return this.imgUri;
    }

}
