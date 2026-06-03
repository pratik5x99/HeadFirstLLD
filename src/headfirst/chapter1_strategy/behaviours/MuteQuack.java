package headfirst.chapter1_strategy.behaviours;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can't produce sound");
    }
}
