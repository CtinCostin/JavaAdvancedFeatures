package com.sda.georgescuconstantin.enums.exercises;

public class MainPlanets {

    public static void main(String[] args) {

        Planets jupiter = Planets.JUPITER;
        System.out.println(jupiter.toString());
        System.out.println(jupiter.distanceFromEarth());

        System.out.println(jupiter.getDistance(Planets.JUPITER));

        Planets saturn = Planets.SATURN;
        System.out.println(saturn.toString());
        System.out.println(saturn.distanceFromEarth());
        System.out.println(saturn.getDistance(Planets.SATURN));

        Planets pluto = Planets.PLUTO;
        System.out.println(pluto.toString());
        System.out.println(pluto.distanceFromEarth());
        System.out.println(pluto.getDistance(Planets.PLUTO));
    }

//        System.out.println(Planets.MARS + " Marte");
//        System.out.println(Planets.JUPITER + " Jupiter");

//        Planets planets = Planets.MARS;
//
//        switch (planets) {
//            case MERCURY:
//                System.out.println("Mercur");
//                System.out.println(Planets.MERCURY);
//                break;
//            case VENUS:
//                System.out.println("Venus");
//                System.out.println(Planets.VENUS);
//                break;
//            case EARTH:
//                System.out.println("Pamant");
//                System.out.println(Planets.EARTH);
//                break;
//            case MARS:
//                System.out.println("Marte");
//                System.out.println(Planets.MARS);
//                break;
//            case JUPITER:
//                System.out.println("Jupiter");
//                System.out.println(Planets.JUPITER);
//                break;
//            case SATURN:
//                System.out.println("Saturn");
//                System.out.println(Planets.SATURN);
//                break;
//            case URANUS:
//                System.out.println("Uranius");
//                System.out.println(Planets.URANUS);
//                break;
//            case NEPTUNE:
//                System.out.println("Neptun");
//                System.out.println(Planets.NEPTUNE);
//                break;
//            case PLUTO:
//                System.out.println("Pluto");
//                System.out.println(Planets.PLUTO);
//                break;
//
//
//        }
//
//        for (Planets planet : Planets.values()) {
//            System.out.println(planet);
//        }
//
}
