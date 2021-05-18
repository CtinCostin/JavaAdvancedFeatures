package com.sda.georgescuconstantin.exercisescoding.exercise1;

public class Developer extends Person{

    private boolean isQualified ;

    public Developer(boolean isQualified , String name){
        super( name);
        this.isQualified = isQualified;
    }

    public void setQualified(boolean isQualified){
        this.isQualified = isQualified;

    }
    @Override
    public void workPlace(){
        System.out.println("Remote");
    }




}
