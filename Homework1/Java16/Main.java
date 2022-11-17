package Homework1.Java16;

public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0]= "İstanbul";
        sehirler[0][1]= "Niğde";
        sehirler[0][2]= "Berkent";
        sehirler[1][0]= "Özkent";
        sehirler[1][1]= "Ankara";
        sehirler[1][2]= "Aksaray";
        sehirler[2][0]= "Fethiye";
        sehirler[2][1]= "Bitlis";
        sehirler[2][2]= "Edirne";

        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                System.out.println(sehirler[j][i]);
            }
            System.out.println("----------+++++++++++---+-+-+--+-+-+-----");
        }


    }
}
