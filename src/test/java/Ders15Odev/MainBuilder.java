package Ders15Odev;

public class MainBuilder {
    public static void main(String[] args) {
        Sports sports = Sports.SportsBuilder.sport()
                .aboutFutbol("Euro 2024'de Türkiye çeyrek finalde Hollandaya karşı mağlubiyet almıştır. \n")
                .aboutVoleybol("VNL'de Kadın A Milli Takımımız çeyrek finalde Polonya'ya karşı mağlubiyet almıştır.\n")
                .aboutTenis("2024 Wibledon tek erkekler şampiyonu Alcaraz olmuştur.\n")
                .build();
        System.out.println(sports);
        //System.out.println(sports.toString());
    }

}
