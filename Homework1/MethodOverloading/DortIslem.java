package Homework1.MethodOverloading;

public class DortIslem {
    public int Topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    };
    public int Topla(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    };
    public int Cıkar(int sayi1,int sayi2){return sayi1-sayi2;};
    public int Carp(int sayi1,int sayi2){return sayi1*sayi2;};
    public int Bol(int sayi1,int sayi2){return sayi1/sayi2;};

}
