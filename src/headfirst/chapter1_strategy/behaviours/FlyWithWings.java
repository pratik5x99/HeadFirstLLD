package headfirst.chapter1_strategy.behaviours;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
