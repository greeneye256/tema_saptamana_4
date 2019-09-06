package simedia;

public class Exercitiul2 {

    public static void main(String[] args) {

        System.out.println(maxOfArray(1,3,4,6343,354,234,87684,6476,65357,88673,35763,24,26,526,767));

    }
    public static int maxOfArray(int ...array){
        int maxim = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>maxim){
                maxim = array[i];
            }
        }
        return maxim;
    }

}
