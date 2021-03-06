package com.sda.georgescuconstantin.inheritance;

public class ChildOne extends Parent {

    private String gender;

    public ChildOne(String name, String phone, String gender) {
        // s-a apelat constructorul din clasa parinte
        super(name, phone);

        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Phone: " + super.getPhone() + ", Gender: " + this.gender;
    }

    @Override
    public void printFields() {
        super.printFields();

        System.out.println("Child class");
        System.out.println(this.gender);
    }

    @Override
    public void parentMethod() {
        System.out.println("method override from child class");
    }

}
