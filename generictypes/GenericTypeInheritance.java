package com.sda.georgescuconstantin.generictypes;

import com.sda.georgescuconstantin.abstractization.Angajat;

// Aceasta clasa generica ACCEPTA doar elemente care au ca parinte
// clasa Angajat
public class GenericTypeInheritance<T extends Angajat> {
    private T item;

    public GenericTypeInheritance(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    //  In clasele generice cu "extends" putem face referire la
//  metodele din clasa parinte, pentru ca stiu sigur ca orice obiect
//  stocat in aceasta clasa are acea metoda.
    public String getPhone() {
        return this.item.getTelefon();
    }

    public String getName() {
        return this.item.getNume();
    }
}