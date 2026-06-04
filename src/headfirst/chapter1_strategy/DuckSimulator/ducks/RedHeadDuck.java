package headfirst.chapter1_strategy.DuckSimulator.ducks;

import headfirst.chapter1_strategy.DuckSimulator.behaviours.FlyWithWings;
import headfirst.chapter1_strategy.DuckSimulator.behaviours.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Red Head Duck");
        // looks like a red head
    }


}
