package headfirst.chapter1_strategy.DuckSimulator.behaviours;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm quacking");
    }
}
