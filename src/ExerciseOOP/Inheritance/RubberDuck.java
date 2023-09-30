package ExerciseOOP.Inheritance;

import ExerciseOOP.AbstrakClass.Duck;
import ExerciseOOP.Implements.FlyNoWay;
import ExerciseOOP.Interface.FlyBehavior;
import ExerciseOOP.Interface.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = () -> System.out.println("Squeak");
    }
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}
