package headfirst.chapter1_strategy.Order.BetterCode;

public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(200);
        orderProcessor.makePayment(new CreditCard());
        System.out.println();
        orderProcessor.makePayment(new Upi());
        System.out.println();
        orderProcessor.makePayment(new PayPal());
    }
}
