package com.sda.georgescuconstantin.exercisescoding.exercise1;

public class JavaDeveloper extends Developer{

    private boolean isQualifiedInJava;

    public JavaDeveloper(boolean isQualifiedInJava , boolean isQualified , String name){
        super(isQualified , name);
        this.isQualifiedInJava = isQualifiedInJava;
    }

    public void setQualifiedInJava(boolean isQualifiedInJava){
        this.isQualifiedInJava = isQualifiedInJava;
    }
    @Override
    public void workPlace(){
        super.workPlace();
        System.out.println("Office");
    }



}
