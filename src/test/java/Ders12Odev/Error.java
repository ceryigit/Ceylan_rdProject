package Ders12Odev;

public class Error {
    public static void main(String[] args) {
        HesapMakinesi hesapla = new HesapMakinesi();
        try {
            System.out.println("Bölme işlemi sonucu: " + hesapla.divide(20,0));
        }
        catch (ArithmeticException ex)
        {
            throw new MyException("Sıfıra bölme işlem hatası");
        }
    }
}
