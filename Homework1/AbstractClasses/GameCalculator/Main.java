package Homework1.AbstractClasses.GameCalculator;

public class Main {
    public static void main(String[] args) {
        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();
    }
}
