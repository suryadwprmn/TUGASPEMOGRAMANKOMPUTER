package Interface;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getBrand());
        System.out.println(car.isMaintanance());
        car.drive();
        System.out.println(car.isBig());

        Car bus = new Bus();
        bus.drive();
        System.out.println(bus.isMaintanance());
    }
}
