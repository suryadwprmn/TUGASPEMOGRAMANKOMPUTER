package ObjectdanClass;

public class PersonApp {

    public static void main(String[] args) {

        // Tipe-tipe pemanggilan Class
        Person person1 = new Person(); //
        //Pemanggilan Field
        person1.nama = "Surya";
        person1.alamat = "Brebes";
        // person1.Negara = "Amerika"; // Karena sudah di final String

        Person person2;
        person2 = new Person(); //
        var person3 = new Person();


        // pemanggilan field
        System.out.println(person1.nama);
        System.out.println(person2); // ke alamat
        System.out.println(person3);


        //pemanggilan method
        person1.MethodSayHello("Nadia Pasha");
        person2.MethodSayHello("Opah"); // ini akan null

    }
}
