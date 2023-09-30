package Inherit;

public class WakilPresiden extends Presiden{


    /**
     * Method Overriding
     */
   void Panggilan(String nama) {
       System.out.println("Hallo " + nama + ", My name is Wakil Presiden " + this.nama);
   }
}
