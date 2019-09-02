package simedia;

public class Exercitiul1 {

    public static void main(String[] args) {
        int numar1 = 76000;
        int numar2 = 76561;
        int countNumerePrime = 0;
        int countDiv = 0;

        for (int i = numar1; i <= numar2; i++) {
            for (int j = 2; j <= i/2; j++) {  //aici m-am uitat pe net dupa ce am rezolvat problema si am adaugat i/2 in loc de i si atunci nu va dura asa mult calculul
                if (i%j==0) {
                    countDiv++;
                    break;
                }
            }
            if (countDiv==0){
                countNumerePrime++;
            }
            countDiv=0;
        }
        System.out.println(countNumerePrime);
    }

}
