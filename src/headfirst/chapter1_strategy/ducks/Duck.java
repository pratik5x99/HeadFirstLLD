package headfirst.chapter1_strategy.ducks;

import headfirst.chapter1_strategy.behaviours.FlyBehaviour;
import headfirst.chapter1_strategy.behaviours.QuackBehaviour;

public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    public void swin(){
        System.out.println("All ducks float, even decoys!");
    }
    public void performFly(){
        flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void changeFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    public void changeQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();
}
