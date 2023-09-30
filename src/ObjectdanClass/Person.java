package ObjectdanClass;

public class Person {
    String nama; // field
    String alamat;

    final String Negara = "Indonesia";

    /**
     *
     * Pembuatan Method
     */
    void MethodSayHello(String paraName){
        System.out.println("Haloo " + paraName +", " + "Nama saya " + nama);
    }
}
