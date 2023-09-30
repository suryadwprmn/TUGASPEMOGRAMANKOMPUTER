package PemogramanKomputer.Inheritance;

public class SepedaGunung extends Sepeda {
    double diameterRoda;
    public SepedaGunung(String merk,String warna, int tahun, double diameter){
        super(merk,warna,tahun);
        this.diameterRoda = diameter;
    }
    public void aturDiameterRoda(double diameter){
        this.diameterRoda = diameter;
    }
    public void lihatInfoSepeda(){
        System.out.println("====== Information Sepeda =======");
        System.out.println("Merek " + merk);
        System.out.println("Warna " + warna);
        System.out.println("Tahun " + tahunRilis);
        System.out.println("Diameter " + diameterRoda);
        System.out.println("");
    }

}
