package headfirst.chapter1_strategy;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        // looks like a rubber duck
    }
    @Override
    public void quack(){
        // Override to squeak
    }
    @Override
    public void fly(){
        // Override to do nothing
    }
}
