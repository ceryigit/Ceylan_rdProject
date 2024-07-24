package Ders6Odev;

public class Maas {

    int aylikMaas = 10000;
    public void maasHesapla (int day) {
        int prim = day-25;
        int  sonuc = (day > 25 ) ? aylikMaas+= 1000*prim : aylikMaas;
        System.out.println(sonuc);

    }
}
