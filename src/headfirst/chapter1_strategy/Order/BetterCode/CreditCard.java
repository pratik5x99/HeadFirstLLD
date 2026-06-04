package headfirst.chapter1_strategy.Order.BetterCode;

public class CreditCard implements PaymentType{
    @Override
    public void pay(double amount) {
        System.out.println("Connecting to Stripe API...");
        // Imagine 30 lines of complex Credit Card logic here
        System.out.println("Paid " + amount);
    }
}
