package com.sda.georgescuconstantin.abstractization;

public class Inginer extends Angajat implements ICalculProgram{

    private String domeniu;

    public Inginer (int id , double salariu,String nume,String telefon , String domeniu){
        super(id,salariu,nume,telefon);
        this.domeniu = domeniu;

    }

    @Override
    public void calculOreProgram() {

    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }
}
