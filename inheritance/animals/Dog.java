package com.sda.georgescuconstantin.inheritance.animals;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal {

    private String race;
    private String name;


    public Dog(String typeOfAnimal, String voiceType, String race, String name) {
        super("dog", "ham");
        this.race = race;
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return this.race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void yieldVoice() {
        System.out.println("Ham");

    }


}



