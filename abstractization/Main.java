package com.sda.georgescuconstantin.abstractization;

public class Main {

    public static void main(String[] args) {


  //      Angajat angajat1 = new Angajat();

        Angajat angajat2 = new Contabil(1,2000,"Ion Ion","0976543210",true);
        Contabil contabil1 = new Contabil(2,3000,"Georgescu Rares","089767890",true);

        contabil1.registerBill();
        contabil1.generateReports();
        contabil1.generateBill();
        contabil1.calculOreProgram();

        Paznic paznic1 = new Paznic(3,"Vasile","087597739",1500,false);
        paznic1.registerEachPersonVisitBuilding();
        paznic1.calculOreProgram();
        paznic1.offerInformation();

    }
}
