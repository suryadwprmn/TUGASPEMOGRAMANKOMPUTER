package ExerciseOOP.Inheritance;

import ExerciseOOP.AbstrakClass.Duck;
import ExerciseOOP.Implements.FlyNoWay;
import ExerciseOOP.Implements.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
