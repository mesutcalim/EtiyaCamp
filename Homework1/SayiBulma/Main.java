package Homework1.SayiBulma;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int sayi=50;
        boolean varMi=false;
        for(int i=0;i<sayilar.length;++i){
            if(sayi==sayilar[i]){
                varMi = true;
            }
        }
        if(varMi){
            System.out.println("Bu sayı mevcuttur.");
        }else{
            System.out.println("Bu sayı yoktur.");
        }
    }
}
