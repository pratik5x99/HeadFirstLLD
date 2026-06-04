package headfirst.chapter1_strategy.Order.ProblematicCode;

public class OrderProcessor {
    private double totalAmount;

    public OrderProcessor(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment(String paymentType) {
        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Connecting to Stripe API...");
            // Imagine 30 lines of complex Credit Card logic here
            System.out.println("Paid " + totalAmount);

        } else if (paymentType.equals("PAYPAL")) {
            System.out.println("Redirecting to PayPal OAuth...");
            // Imagine 20 lines of PayPal logic here
            System.out.println("Paid " + totalAmount);

        } else if (paymentType.equals("UPI")) {
            System.out.println("Pinging Google Pay/PhonePe...");
            // Imagine 15 lines of UPI logic here
            System.out.println("Paid " + totalAmount);

        } else {
            System.out.println("Error: Unknown payment method.");
        }
    }
}