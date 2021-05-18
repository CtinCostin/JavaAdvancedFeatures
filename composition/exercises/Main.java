package com.sda.georgescuconstantin.composition.exercises;

public class Main {

    public static void main(String[] args) {

        Muzzle muzzle = new Muzzle("black");
        Dog dog = new Dog(muzzle);
        System.out.println(dog.getMuzzle().getColour());
        Muzzle m = dog.getMuzzle();
        System.out.println(m.getColour());

    }
}
