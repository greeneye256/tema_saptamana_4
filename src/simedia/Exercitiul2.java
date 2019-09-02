package simedia;

public class Exercitiul2 {

    public static void main(String[] args) {
        int[] arrayNumbers = {1,2,4,45,43,23,867,4352,12,123,432,1,23,4,};
        int maxim = arrayNumbers[0];
        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i]>maxim){
                maxim = arrayNumbers[i];
            }
        }
        System.out.println(maxim);
    }

}
