package Ders14Odev;

public class Generic {
    public static class Bilgi<T> {
        private T content;
        public void setContent(T content) {
            this.content = content;
        }
        public T getContent() {
            return content;
        }
    }
    public static void main(String[] args) {
        Bilgi<String> adSoyad = new Bilgi<>();
        adSoyad.setContent("Ceylan Eryiğit");
        System.out.println("Ad soyad: " + adSoyad.getContent());
        Bilgi<Integer> yas = new Bilgi<>();
        yas.setContent(28);
        System.out.println("Yaşı: " + yas.getContent());
    }
}
