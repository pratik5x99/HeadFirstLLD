package headfirst.chapter1_strategy.ducks;

import headfirst.chapter1_strategy.behaviours.FlyNoWay;
import headfirst.chapter1_strategy.behaviours.MuteQuack;

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
