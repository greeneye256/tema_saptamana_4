package simedia;

public class Exercitiul1 {

    public static void main(String[] args) {
        int numar1 = 2;
        int numar2 = 76561;
        int countNumerePrime = 0;

        if (numar1==2){
            countNumerePrime++;
            System.out.println(numar1);
        }

        if (numar1%2 == 0){
            numar1++;
        }

        for (int i = numar1; i <= numar2; i+=2) {
            if (isPrime(i)){
                countNumerePrime++;
                System.out.println(i);
            }
        }
        System.out.println(countNumerePrime);
    }
    public static boolean isPrime(int number){
        int countDiv = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number%i == 0){
                countDiv++;
                break;
            }
        }
        return (countDiv==0);
    }

}
