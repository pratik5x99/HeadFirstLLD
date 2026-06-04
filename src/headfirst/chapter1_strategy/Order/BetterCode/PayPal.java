package headfirst.chapter1_strategy.Order.BetterCode;

public class PayPal implements PaymentType{
    @Override
    public void pay(double amount) {
        System.out.println("Redirecting to PayPal OAuth...");
        // Imagine 20 lines of PayPal logic here
        System.out.println("Paid " + amount);
    }
}
