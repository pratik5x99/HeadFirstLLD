package headfirst.chapter1_strategy.ducks;

import headfirst.chapter1_strategy.behaviours.FlyWithWings;
import headfirst.chapter1_strategy.behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real MallardDuck");
        // looks like a mallard
    }
}
