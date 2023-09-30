package PemogramanKomputer.Inheritance;

public class Main {
    public static void main(String[] args) {
        SepedaGunung sg = new SepedaGunung("Wym Cycle", "biru",2020, 21.5);
        sg.lihatInfoSepeda();
        sg.aturWarna("Biru");
        sg.aturMerk("Polygon");
        sg.aturDiameterRoda(28.9);
        sg.lihatInfoSepeda();
    }
}
