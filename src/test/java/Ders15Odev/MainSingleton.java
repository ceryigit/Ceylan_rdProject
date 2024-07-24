package Ders15Odev;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.getYas();
        singleton.displayInfo();
        System.out.println("--------------------------");
        singleton.setYas(27);
        System.out.println("Düzenlenen yaş: " + singleton.getYas());

    }
}
