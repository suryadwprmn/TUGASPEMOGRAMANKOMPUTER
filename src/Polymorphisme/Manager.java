package Polymorphisme;

public class Manager extends Employee {
    String company;

    Manager (String name, String company){
        super(name);
        this.company = company;
    }
    Manager (String name){
        super(name);
    }



    void SayHello(String name){
        System.out.println("Hello "+ name + " , My name is Manager " + this.name );
    }
}
