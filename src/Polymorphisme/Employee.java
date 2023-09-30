package Polymorphisme;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    void SayHello(String name){
        System.out.println("Hello "+ name + " , My name is Employee " + this.name );
    }
}
