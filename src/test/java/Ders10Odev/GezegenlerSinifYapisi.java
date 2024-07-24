package Ders10Odev;

public class GezegenlerSinifYapisi {
    public static void main(String[] args) {
        Gezegenler secilen = Gezegenler.Saturn;

        System.out.println("Seçilen gezegen ismi: " + secilen);
        System.out.println("Gezegenin numarası: " + secilen.getGezegensayisi());
        System.out.println("Gezegenin halkası var mı? -> " + secilen.getHalkasiVar());
    }
}
