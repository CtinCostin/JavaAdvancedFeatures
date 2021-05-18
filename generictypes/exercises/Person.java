package com.sda.georgescuconstantin.generictypes.exercises;

public class Person implements Comparable<Person> {
    private String name;
    private double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
