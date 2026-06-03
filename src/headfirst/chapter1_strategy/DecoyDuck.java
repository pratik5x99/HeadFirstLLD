package headfirst.chapter1_strategy;

public class DecoyDuck extends Duck{
    @Override
    public void display() {
        // looks like decoy duck
    }
    @Override
    public void quack(){
        // do nothing
    }
    @Override
    public void fly(){
        // do nothing
    }
}
