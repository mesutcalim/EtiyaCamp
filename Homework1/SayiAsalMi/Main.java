package Homework1.SayiAsalMi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Asal olması durumunu kontrol etmek istediğniz sayıyı giriniz: ");
        int sayi = input.nextInt();
        int asalCheck=0;
        if(sayi<=2){
            System.out.println("1 ve 2 asal sayıdr lütfen daha yüksek sayılar giriniz.");
        }
        if(sayi>=3 && sayi>0){
            for(int i=2;i<sayi;++i){
                if(sayi%i==0)
                    asalCheck+=1;
            }
            if(asalCheck==0){
                System.out.println(sayi + " sayısı asaldır.");
            }
            else{
                System.out.println(sayi+" sayısı asal değildir.");
            }
        }
        else{
            System.out.println("Yanlış değer girdiniz!");
        }
    }
}
