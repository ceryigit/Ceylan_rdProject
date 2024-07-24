package Ders15Odev;

public class Sports {
    private String futbol, voleybol, tenis;
    public static final class SportsBuilder {
        private String futbol, voleybol, tenis;

        private SportsBuilder() {
        }

        public static SportsBuilder sport() {
            return new SportsBuilder();
        }

        public SportsBuilder aboutTenis(String tenis) {
            this.tenis = tenis;
            return this;
        }

        public SportsBuilder aboutFutbol(String futbol) {
            this.futbol= futbol;
            return this;
        }

        public SportsBuilder aboutVoleybol(String voleybol) {
            this.voleybol = voleybol;
            return this;
        }

        public Sports build() {
            Sports sporDali = new Sports();
            sporDali.tenis = this.tenis;
            sporDali.voleybol = this.voleybol;
            sporDali.futbol= this.futbol;
            return sporDali;
        }
    }

    @Override
    public String toString() {
        return "Bazı spor dallarındaki son durumlar: \n" + tenis + voleybol + futbol;
    }
}
