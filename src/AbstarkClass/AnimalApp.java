package AbstarkClass;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Rabbit(); //Polymorphisme
        animal.name = "Pussy";

        animal.run();
    }
}
