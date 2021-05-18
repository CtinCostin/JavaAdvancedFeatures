package com.sda.georgescuconstantin.generictypes.exercises;

public class GenericCup <T>{
    private T item;



    public GenericCup(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }


}
