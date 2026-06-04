package headfirst.chapter1_strategy.DuckSimulator.ducks;

import headfirst.chapter1_strategy.DuckSimulator.behaviours.FlyNoWay;
import headfirst.chapter1_strategy.DuckSimulator.behaviours.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I'm a real DecoyDuck");
        // looks like decoy duck
    }

}
