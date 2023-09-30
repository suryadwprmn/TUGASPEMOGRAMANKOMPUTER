package Tostring;

public class ProdukApp {
    public static void main(String[] args) {
        Produk produk = new Produk("Iphone 11 Pro Max", 1000_000);

        System.out.println(produk); // dikasih method toString

        Produk produk2 = new Produk("Iphone 11 Pro Max",1000_000);

        System.out.println(produk == produk2 ); //return false
        System.out.println(produk.equals(produk2)); // return true
        System.out.println(produk.hashCode() == produk2.hashCode());
    }
}
