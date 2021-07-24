package com.example.payback;

public class Person{

    private String name;
    private float money;

    public Person(String name){
        this.name = name;
        this.money = 0;
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

}
