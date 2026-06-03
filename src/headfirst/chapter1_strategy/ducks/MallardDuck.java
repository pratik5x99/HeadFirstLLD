package headfirst.chapter1_strategy.ducks;

import headfirst.chapter1_strategy.behaviours.Flyable;
import headfirst.chapter1_strategy.behaviours.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        // looks like a mallard
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
