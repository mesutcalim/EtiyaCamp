package Homework1.Metodlar;

public class methods {
    public static void main(String[] args) {
        sayiBulma();
        sayiBulma();
        sayiBulma();
    }
    public static void sayiBulma() {
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int sayi=50;
        boolean varMi=false;
        for(int i=0;i<sayilar.length;++i){
            if(sayi==sayilar[i]){
                varMi = true;
            }
        }
        if(varMi){
            mesajVer(sayi+" sayısı dizide mevcuttur.");
        }else{
            mesajVer(sayi+" sayısı dizide yoktur.");
        }
    }

    private static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
