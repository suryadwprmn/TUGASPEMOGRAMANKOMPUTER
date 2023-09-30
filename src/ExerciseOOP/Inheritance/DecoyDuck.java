package ExerciseOOP.Inheritance;

import ExerciseOOP.AbstrakClass.Duck;
import ExerciseOOP.Implements.FlyNoWay;
import ExerciseOOP.Implements.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
