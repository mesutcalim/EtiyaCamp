package Homework1.Metodlar;

public class methods2 {
    public static void main(String[] args) {
        String mesaj = "Bu gün hava çok soğuk";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(3,6);
        System.out.println(sayi);
        int toplam = topla2(2,2,4,6,33,5);
        System.out.println(toplam);
    }
    public static  void ekle(){
        System.out.println("Eklendi");
    }
    public static  void sil(){
        System.out.println("Silindi");
    }
    public static  void güncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
    return sayi1 + sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }

        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}
