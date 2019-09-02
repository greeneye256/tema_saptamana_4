package simedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bonus {

    static String cvs = "1,Ana,V,1994,ana@mail.com,Java";

    public static void main(String[] args) {

        printValueOfPosition(1);
        printValueOfParameter("nume");

    }

    public static List<String> createArrayFromCvs(String cvs) {
        String forLoop = cvs;
        List<String> listaParametrii = new ArrayList<>(6);
        for (int i = 0; i < forLoop.length(); i++) {
            if (forLoop.charAt(i) == ',') {
                listaParametrii.add(forLoop.substring(0, i));
                forLoop = forLoop.substring(i + 1);
                i = 0;
            }
            if (i==forLoop.length()-1){
                listaParametrii.add(forLoop);
            }

        }

        return listaParametrii;
    }

    public static void printValueOfPosition(int position){
        List<String> arrayOfParameters = createArrayFromCvs(cvs);
        switch (position){
            case 1:
                System.out.println("Id: " + arrayOfParameters.get(0));
                break;
            case 2:
                System.out.println("Numele: " + arrayOfParameters.get(1));
                break;
            case 3:
                System.out.println("Initiala tatalui: " + arrayOfParameters.get(2));
                break;
            case 4:
                System.out.println("Anul de nastere: " + arrayOfParameters.get(3));
                break;
            case 5:
                System.out.println("Email: " + arrayOfParameters.get(4));
                break;
            case 6:
                System.out.println("Limbaj de programare: " + arrayOfParameters.get(5));
                break;
            default:
                System.out.println("Wrong position.");
        }
    }

    public static void printValueOfParameter(String parameter){
        List<String> arrayOfParameters = createArrayFromCvs(cvs);
        switch (parameter){
            case "id":
                System.out.println(arrayOfParameters.get(0));
                break;
            case "nume":
                System.out.println(arrayOfParameters.get(1));
                break;
            case "initiala":
                System.out.println(arrayOfParameters.get(2));
                break;
            case "an de nastere":
                System.out.println(arrayOfParameters.get(3));
                break;
            case "email":
                System.out.println(arrayOfParameters.get(4));
                break;
            case "limbaj":
                System.out.println(arrayOfParameters.get(5));
                break;
            default:
                System.out.println("Wrong parameter.");
        }
    }

    // am gasit pe internet metoda asta

    public static void makeListFromCvs(String cvs){

        List<String > listFromCvs = new ArrayList<String>(Arrays.asList(cvs.split(",")));

    }


}
