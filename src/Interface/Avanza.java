package Interface;

public class Avanza implements Car{

    @Override
    public String getBrand() {
        return "Honda";
    }

    @Override
    public boolean isMaintanance() {
        return false;
    }

    public void drive(){
        System.out.println(name + " is riding" );
    }

    @Override
    public int getTier() {
        return 4;
    }


}
