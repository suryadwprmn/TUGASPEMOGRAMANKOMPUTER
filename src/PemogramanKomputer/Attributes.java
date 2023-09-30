package PemogramanKomputer;

public class Attributes {
    int nilai = 99;
    String kelas = "C";
    int angkatan = 2019;
    private void cetakNilai(){
        System.out.println("Nilai " + nilai);
    }
    private void ubahNilai(int nilaiBaru){
        this.nilai = nilaiBaru;
    }

    public static void main(String[] args) {
        Attributes obyek = new Attributes();
        //Nilai lama
        System.out.println("Nilai dari parameter : " + obyek.nilai);
        //Nilai Baru
        obyek.nilai = 100;
        System.out.println("Ini nilai setelah dirubah obyek nilai : " + obyek.nilai);

        obyek.ubahNilai(88);
        System.out.println("Ini dari parameter ubahNilai : " + obyek.nilai);

    }
}
