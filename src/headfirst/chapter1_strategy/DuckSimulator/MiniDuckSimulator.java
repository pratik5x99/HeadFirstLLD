package headfirst.chapter1_strategy.DuckSimulator;

import headfirst.chapter1_strategy.DuckSimulator.behaviours.FlyRocketPowered;
import headfirst.chapter1_strategy.DuckSimulator.ducks.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("--- Testing Mallard Duck ---");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n--- Testing Red Head Duck ---");
        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.performQuack();
        redHead.performFly();

        System.out.println("\n--- Testing Rubber Duck ---");
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();

        System.out.println("\n--- Testing Decoy Duck ---");
        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        System.out.println("\n--- Testing Rubber Duck ---");
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performQuack();

        System.out.println();

        System.out.println("Trying to change model duck behaviour");
        modelDuck.changeFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
        
    }
}
