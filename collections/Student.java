package com.sda.georgescuconstantin.collections;

public class Student implements IPerson {

    public String name;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("SayHello from Student Class.");
    }

    public void sayHelloFromInterfaceParam(IPerson personInterface) {
        System.out.println("method -> sayHelloFromInterfaceParam()");
        personInterface.sayHello();
    }
}