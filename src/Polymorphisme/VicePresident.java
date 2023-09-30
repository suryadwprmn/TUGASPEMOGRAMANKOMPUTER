package Polymorphisme;

public class VicePresident extends Manager {

String addres;
    VicePresident(String name, String company){
        super(name,company);
    }
    VicePresident (String name, String company, String addres){
        super(name,company);
        this.addres = addres;
    }
    VicePresident (String name){
        super(name);
    }

    void SayHello(String name){
        System.out.println("Hello "+ name + " , My name is VP " + this.name );
    }
}
