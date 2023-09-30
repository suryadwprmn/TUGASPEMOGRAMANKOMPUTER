package Interface;

public class Bus implements Car{

    String name = "Jetbus ";
    @Override
    public void drive() {
        System.out.println(name + "is riding");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public boolean isBig() {
        return Car.super.isBig();
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    @Override
    public boolean isMaintanance() {
        return true;
    }
    //2 :17:33
}
