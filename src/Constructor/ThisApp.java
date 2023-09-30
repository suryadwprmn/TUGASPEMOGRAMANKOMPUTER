package Constructor;

public class ThisApp {

    public static void main(String[] args) {
        This aThis = new This("Surya","Brebes");
        This aThis2 = new This("Aldhi");
        This aThis3 = new This();
        System.out.println(aThis.name);
        System.out.println(aThis2.name);
        System.out.println(aThis3.name);
        //

    }

}
