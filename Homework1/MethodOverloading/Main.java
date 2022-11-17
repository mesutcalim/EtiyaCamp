package Homework1.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(5,2);
        System.out.println(sonuc);
        sonuc = dortIslem.Topla(5,2,8);
        System.out.println(sonuc);
    }
}
