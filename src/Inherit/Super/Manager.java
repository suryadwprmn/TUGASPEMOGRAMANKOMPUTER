package Inherit.Super;

public class Manager {
    String name;
    String addres;

    /**
     * Constructor
     */

    public Manager(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    void SayHello( String name , String addres ,int age){
        System.out.println("Hello " + name + ", My name is " + this.name);
        System.out.println("My addres is " + this.addres);

        // Menit 1 :03:27
    }
}
