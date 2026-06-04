package headfirst.chapter1_strategy.DuckSimulator.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm squeaking");
    }
}
