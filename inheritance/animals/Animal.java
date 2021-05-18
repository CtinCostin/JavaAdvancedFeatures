package com.sda.georgescuconstantin.inheritance.animals;

import java.util.Arrays;

public abstract class Animal {



    private String typeOfAnimal;
    private String voiceType;




    public Animal(String typeOfAnimal, String voiceType) {
        this.typeOfAnimal = typeOfAnimal;
        this.voiceType = voiceType;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getTypeOfAnimal() {
        return this.typeOfAnimal;
    }

    public void setVoiceType(String voiceType) {
        this.voiceType = voiceType;

    }

    public String getVoiceType() {
        return this.voiceType;
    }

    public Animal[] createAnimals() {

        Animal dog = new Dog("Dog", "ham", "Husky","Rex");
        Animal cat = new Cat("Grey", "Sky","black","Mimi");
        Animal[] animals = {dog, cat};
        return animals;
    }



    public abstract void yieldVoice() ;
//        if (voiceType.equals("ham")) {
//            System.out.println("The animal is a dog");
//        } else {
//            if (voiceType.equals("miau")) {
//                System.out.println("The animal is a cat");
//            } else {
//                System.out.println("There is other animal");
//            }
//        }
//    }
    }




