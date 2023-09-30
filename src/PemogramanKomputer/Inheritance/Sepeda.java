package PemogramanKomputer.Inheritance;

public class Sepeda {
    String merk, warna;
    int tahunRilis;

    public Sepeda(String merk, String warna, int tahunRilis) {
        this.merk = merk;
        this.warna = warna;
        this.tahunRilis = tahunRilis;
    }

    public void aturWarna(String warna){
        this.warna = warna;
    }
    public void aturTahunRilis(int tahun){
        this.tahunRilis = tahun;
    }
    public void aturMerk(String merk){
        this.merk = merk;
    }


}
