package AbstarkClass;

public class LocationApp {
    public static void main(String[] args) {

        /**
         * Abstrak Class
         */
        //Location location = new Location(); // ERROR karena abstrak class tidak bisa dibuat

        Posisi posisi = new Posisi();
        posisi.name = "Asu";
    }
}
