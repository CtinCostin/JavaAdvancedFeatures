package com.sda.georgescuconstantin.exercisescoding.exercise1;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void workPlace(){
        System.out.println("Home and Office");
    }
}
