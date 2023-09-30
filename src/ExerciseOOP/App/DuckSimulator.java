package ExerciseOOP.App;

import ExerciseOOP.AbstrakClass.Duck;
import ExerciseOOP.Implements.FlyRocketPowered;
import ExerciseOOP.Inheritance.DecoyDuck;
import ExerciseOOP.Inheritance.MallardDuck;
import ExerciseOOP.Inheritance.ModelDuck;
import ExerciseOOP.Inheritance.RubberDuck;
import ExerciseOOP.Interface.FlyBehavior;
import ExerciseOOP.Interface.QuackBehavior;
import java.util.Scanner;

public class DuckSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih jenis bebek (1 untuk Mallard Duck, 2 untuk Rubber Duck, 3 untuk Decoy Duck, 4 untuk Model Duck, 0 untuk keluar):");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            Duck duck = createDuck(choice);

            if (duck != null) {
                duck.display();
                duck.performQuack();
                duck.performFly();
                System.out.println();
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }

    private static Duck createDuck(int choice) {
        FlyBehavior flyBehavior = () -> System.out.println("I cant fly");
        QuackBehavior quackBehavior = () -> System.out.println("Squeak");

        switch (choice) {
            case 1:
                return new MallardDuck();
            case 2:
                return new RubberDuck(flyBehavior, quackBehavior);
            case 3:
                return new DecoyDuck();
            case 4:
                Duck modelDuck = new ModelDuck();
                modelDuck.setFlyBehavior(new FlyRocketPowered());
                return modelDuck;
            default:
                return null;
        }
    }
}
