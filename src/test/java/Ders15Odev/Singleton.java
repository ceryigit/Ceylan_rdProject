package Ders15Odev;

public class Singleton {
    private static Singleton instance;
    private String ad, soyad;
    private int yas;
    private Singleton() {
        this.ad="Ceylan";
        this.soyad="Eryiğit";
        this.yas=28;

    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void displayInfo() {
        System.out.println("İsim: " + ad +"\n" + "Soyisim: " + soyad +"\n"+ "Yaş: " + yas);
    }
}
