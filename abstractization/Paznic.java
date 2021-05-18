package com.sda.georgescuconstantin.abstractization;

public class Paznic extends Angajat implements IFisaPostPaznic{
    private boolean hasGun;

    public Paznic (int id,String nume,String telefon ,int salariu , boolean hasGun){
        super(id,salariu,nume, telefon);
        this.hasGun = hasGun;
    }

    @Override
    public void calculOreProgram() {

    }

    public boolean isHasGun() {
        return hasGun;
    }

    public void setHasGun(boolean hasGun) {
        this.hasGun = hasGun;
    }

    @Override
    public void registerEachPersonVisitBuilding() {

    }

    @Override
    public void offerInformation() {

    }
}
