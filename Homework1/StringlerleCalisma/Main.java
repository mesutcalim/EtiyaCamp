package Homework1.StringlerleCalisma;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava pek güzel değil!";
        System.out.println(mesaj);

        /*
        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5.Eleman:   "+ mesaj.charAt(4));
        System.out.println(mesaj.concat("Olsun be."));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
         */

        String newMessage = mesaj.replace(" ","-");
        System.out.println(newMessage);
        System.out.println(mesaj.substring(2,5));

        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
    }
}
