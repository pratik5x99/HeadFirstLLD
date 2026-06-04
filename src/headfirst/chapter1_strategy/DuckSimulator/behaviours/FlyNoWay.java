package headfirst.chapter1_strategy.DuckSimulator.behaviours;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
