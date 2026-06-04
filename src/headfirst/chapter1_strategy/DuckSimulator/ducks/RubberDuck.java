package headfirst.chapter1_strategy.DuckSimulator.ducks;

import headfirst.chapter1_strategy.DuckSimulator.behaviours.FlyNoWay;
import headfirst.chapter1_strategy.DuckSimulator.behaviours.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Rubber duck");
        // looks like a rubber duck
    }
}
