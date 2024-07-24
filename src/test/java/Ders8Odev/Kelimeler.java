package Ders8Odev;

import java.util.*;

public class Kelimeler {
    public static void main(String[] args) {
        String kelimeler[] = {"merak", "araba", "elveda","merhaba"};
        ArrayList<String> tekrarEdenKelimeler = new ArrayList<>();
        HashSet<String> harfler = new HashSet<>();
        for (String kelime: kelimeler)
        {
            int tekrarsayisi=0;
            for (int i=0; i<kelime.length(); i++)
            {
                char harf=kelime.charAt(i);
                for (int j=0; j<kelime.length(); j++)
                {
                    if (i==j)
                    {
                     continue;
                    }
                    if (harf==kelime.charAt(j))
                    {
                        tekrarsayisi++;
                    }
                }
            }
            if (tekrarsayisi>1){
                tekrarEdenKelimeler.add(kelime);
            }
            if (tekrarEdenKelimeler.size() == 2){
                break;
            }
        }
        System.out.println("Harf tekrarı olan ilk iki kelime: " + tekrarEdenKelimeler);
        String tekrarlikelimeler = tekrarEdenKelimeler.get(0)+tekrarEdenKelimeler.get(1);
        int toplamHarfSayisi = tekrarlikelimeler.length();
        System.out.println("Toplam Harf Sayısı: " + toplamHarfSayisi);

        ArrayList<Character> tekrarEdenHarfler= new ArrayList<Character>();
        for (String kelime: tekrarEdenKelimeler){
            for (int i=0; i<kelime.length(); i++){
                tekrarEdenHarfler.add(kelime.charAt(i));
            }

        }
        String yeniKelime="";
        for (int i =0; i<5; i++){
            Random rastgele = new Random();
            int randomindeks = rastgele.nextInt(tekrarlikelimeler.length());
            yeniKelime+= tekrarEdenHarfler.get(randomindeks);

            System.out.println("Seçilen rastgele indeks: " +randomindeks);
        }
        System.out.println(tekrarEdenHarfler);
        System.out.println("Oluşan yeni kelime: " + yeniKelime);

    }

}



