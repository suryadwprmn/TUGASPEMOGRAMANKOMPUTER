package Inherit;

public class PresidenApp {
    public static void main(String[] args) {
        Presiden presiden = new Presiden();
        presiden.nama = "Joko Widodo";
        presiden.Panggilan("Budi");

        WakilPresiden wakilPresiden = new WakilPresiden();
        wakilPresiden.nama = "Ma'ruf Amin";
        wakilPresiden.Panggilan("Budi");
    }


}
