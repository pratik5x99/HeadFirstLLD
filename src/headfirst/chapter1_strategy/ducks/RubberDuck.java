package headfirst.chapter1_strategy.ducks;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        // looks like a rubber duck
    }

    public void quack(){
        // Override to squeak
    }

    public void fly(){
        // Override to do nothing
    }
}
