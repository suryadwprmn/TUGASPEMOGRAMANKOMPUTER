package ExerciseOOP.Inheritance;

import ExerciseOOP.AbstrakClass.Duck;
import ExerciseOOP.Implements.FlyWithWings;
import ExerciseOOP.Implements.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm real Mallard Duck");
    }
}
