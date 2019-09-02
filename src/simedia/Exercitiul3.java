package simedia;

import java.util.Scanner;

public class Exercitiul3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int random = (int)(Math.random()*20 + 1);
        byte numar = 0;
        System.out.println("Va simtiti norocos? Stiu un numar secret. Este intre 0 si 20. Daca il ghicesti din 3 incercari o sa pun o vorba buna la angajare!");

        for (int i = 1; i < 4; i++) {
            System.out.println("Incercarea " + i + ":");
            numar = scn.nextByte();
            if (numar>random){
                System.out.println("Raspuns gresit, numarul tau este prea mare.");}
            else if (numar<random){
                System.out.println("Raspuns gresit, numarul tau este prea mic.");
            }
            else {
                System.out.println("Ai castigat!!!");
                break;
            }
        }
        if (numar!=random){
            System.out.println("Numarul secret era " + random + ".");
        }
    }

}
