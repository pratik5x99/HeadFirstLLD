package headfirst.chapter1_strategy.ducks;

import headfirst.chapter1_strategy.behaviours.FlyWithWings;
import headfirst.chapter1_strategy.behaviours.Quack;

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
