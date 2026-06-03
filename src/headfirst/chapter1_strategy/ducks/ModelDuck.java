package headfirst.chapter1_strategy.ducks;

import headfirst.chapter1_strategy.behaviours.FlyNoWay;
import headfirst.chapter1_strategy.behaviours.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}