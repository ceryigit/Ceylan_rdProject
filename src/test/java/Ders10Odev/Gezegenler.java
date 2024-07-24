package Ders10Odev;

public enum Gezegenler {
    Merkur (8, false),
    Venus(7, false),
    Dunya(6, false),
    Mars(5,false),
    Jupiter(4,false),
    Saturn(3, true),
    Uranus(2, false),
    Neptun(1, false);

        private boolean halkasiVar;

        private int gezegensayisi;

        public int getGezegensayisi() {
            return gezegensayisi;
        }
        public boolean getHalkasiVar() {
            return halkasiVar;
         }

        Gezegenler(int gezegensayisi, boolean halkasiVar){
            this.gezegensayisi= gezegensayisi;
            this.halkasiVar = halkasiVar;
        }

}
