package com.sda.georgescuconstantin.inheritance.animals;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("dog", "ham", "Husky", "Rex");
//        System.out.println("The dog has the race : " + dog.getRace() + " , and the name is : " + dog.getName());
//        System.out.println(dog.getTypeOfAnimal());
//        System.out.println(dog.getRace());
        Cat cat = new Cat("Grey", "Mimi", "black", "MImi");
//        System.out.println("The ca has the fur color : " + cat.getFurColor() + " ; and the name is : " + cat.getName());
        //      Animal animal = new Animal("cat", "miau");
        //     animal.yieldVoice("miau");
//       Animal animal1 = new Cat("Grey", "Garfield");
        //       System.out.println("The cat has the voice type :" + animal1.getVoiceType());
//        System.out.println("The animal is a : " + animal.getTypeOfAnimal());
        //      Animal animal2 = new Dog("dog", "ham", "Akita", "Sky");

        //       System.out.println("The dog has the voice type :" + animal2.getVoiceType());
        //       System.out.println("The animal is a : " + animal.getTypeOfAnimal());
        //      System.out.println("The dog has the race :" + animal2.);
        //      System.out.println(animal1.getClass());

        //      animal1.toString();

         // array de obiecte
        Animal[] animals = new Animal[]{cat, dog};
        for (Animal animal : animals) {
            System.out.println(animal.getVoiceType());
            animal.yieldVoice();
        }


    }
}
