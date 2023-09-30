package ExerciseOOP.Implements;

import ExerciseOOP.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fliying");
    }
}
