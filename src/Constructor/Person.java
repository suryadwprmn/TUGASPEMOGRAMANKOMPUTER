package Constructor;

public class Person {
    String name;
    String addres;

    //Constructor
    Person (String paramName,String paramAddres){
        name = paramName;
        addres = paramAddres;
    }

    Person (String paramName){
        name = paramName;
    }

     Person() {
    }

    void SayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }

}
