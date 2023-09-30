package ExerciseOOP.Inheritance;

import ExerciseOOP.AbstrakClass.Duck;
import ExerciseOOP.Implements.FlyWithWings;
import ExerciseOOP.Implements.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        flyBehavior= new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm real Red Headed duck");
    }
}
