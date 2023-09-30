package ExerciseOOP.Implements;

import ExerciseOOP.Interface.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
