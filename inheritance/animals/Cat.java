package com.sda.georgescuconstantin.inheritance.animals;

public class Cat extends Animal {

    private String furColor;
    private String name;


    public Cat(String typeOfAnimal,String voiceType,String furColor, String name) {
        super("cat", "miau");
        this.furColor = furColor;
        this.name = name;

    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return this.furColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void yieldVoice(){
        System.out.println("Miau");
    }

}

