package Homework1.recapDemo1;

public class Main {
    public static void main(String[] args) {
        int number1 = 27;
        int number2 = 32;
        int number3 = 9;
        int greatest = number1;

        if(greatest<number2) {
            greatest = number2;
        }
        if(greatest<number3) {
            greatest = number3;
        }

        System.out.println("The greatest number is: "+greatest);

    }
}