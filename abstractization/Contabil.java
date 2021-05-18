package com.sda.georgescuconstantin.abstractization;

public class Contabil extends Angajat implements IFisaPostContabil,ICalculProgram{
    private boolean hasExperience;

    public Contabil(int id , double salariu,String nume,String telefon , boolean hasExperience){
        super(id,salariu,nume,telefon);

        this.hasExperience=hasExperience;

    }


    @Override
    public void calculOreProgram() {

    }
    public void setHasExperience(boolean hasExperience){
        this.hasExperience = hasExperience;
    }
    public boolean isHasExperience(){
        return isHasExperience();
    }

    @Override
    public void registerBill() {

    }

    @Override
    public void generateBill() {

    }

    @Override
    public void generateReports() {

    }
}
