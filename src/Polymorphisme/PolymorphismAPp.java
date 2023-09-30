package Polymorphisme;

public class PolymorphismAPp {
    public static void main(String[] args) {
        //Polymorphism bisa berubahh bentuk dari satu bentuk ke bentuk lain
        Employee employee = new Employee("Surya");
        employee.SayHello("Budi");

        employee = new Manager("Surya");
        employee.SayHello("Budi");

        employee = new VicePresident("Surya");
        employee.SayHello("Budi");

        // 1:16:59
    }
}
