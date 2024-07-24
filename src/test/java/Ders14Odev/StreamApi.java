package Ders14Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer > sayilar = Arrays.asList(12,-56,9,24,36,-5);
        List<Integer> negative = sayilar.stream()
                .filter(sayi -> sayi < 0)
                .collect(Collectors.toList());
        if (negative.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println("Negatif sayılar: " + negative);
        }
    }
}
