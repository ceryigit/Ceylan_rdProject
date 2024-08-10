package Ders6Odev;

public class Maas {

    int aylikMaas = 10000;
    public int maasHesapla(int day) {
        int prim = day - 25;
        if (day > 25) {
            return aylikMaas + 1000 * prim;
        } else {
            return aylikMaas;
        }
    }
}
