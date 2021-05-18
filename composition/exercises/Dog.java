package com.sda.georgescuconstantin.composition.exercises;

public class Dog {

    private Muzzle muzzle;

    public Dog(Muzzle muzzle) {
        this.muzzle = muzzle;
    }

    public Muzzle getMuzzle() {
        return this.muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }
}
