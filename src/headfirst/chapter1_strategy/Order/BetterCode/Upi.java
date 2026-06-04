package headfirst.chapter1_strategy.Order.BetterCode;

public class Upi implements PaymentType{

    @Override
    public void pay(double amount) {
        System.out.println("Pinging Google Pay/PhonePe...");
        // Imagine 15 lines of UPI logic here
        System.out.println("Paid " + amount);
    }
}
