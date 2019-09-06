package simedia;

import java.util.Scanner;

public class Exercitiul3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int random = (int) (Math.random() * 20 + 1);
        byte numar = 0;
        System.out.println("Va simtiti norocos? Stiu un numar secret. Este intre 0 si 20. Daca il ghicesti din 3 incercari o sa pun o vorba buna la angajare!");

        for (int i = 1; i < 4; i++) {
            printTryToGuess(i);
            numar = scn.nextByte();
            if (numar > random) {
                printGreaterThen();
            } else if (numar < random) {
                printLessThan();
            } else {
                printWin();
                break;
            }
        }
        if (numar != random) {
            printSecretNumber(random);
        }
    }
    public static void printGreaterThen(){
        System.out.println("Raspuns gresit, numarul tau este prea mare.");
    }
    public static void printLessThan(){
        System.out.println("Raspuns gresit, numarul tau este prea mic.");
    }
    public static void printTryToGuess(int i){
        System.out.println("Incercarea " + i + ":");
    }
    public static void printWin(){
        System.out.println("Ai castigat!!!");
    }
    public static void printSecretNumber(int random){
        System.out.println("Numarul secret era " + random + ". Ne pare rau, nu prea ai noroc.");
    }

}
