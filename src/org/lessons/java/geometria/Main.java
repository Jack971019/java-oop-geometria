package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("square misures");
        System.out.println("base misure");
        int baseValue = Integer.parseInt(scan.nextLine());

        System.out.println("high misure");
        int highvalue = Integer.parseInt(scan.nextLine());

        //creo un oggetto square

        Rectangle square = new Rectangle(baseValue, highvalue);

        //chiedo all'impiegato di calcolare area e perimetro

        System.out.println("Square perimeter:" + square.getsquareperimeter());

        System.out.println("Square area:" + square.getsquarearea());


    }
}
