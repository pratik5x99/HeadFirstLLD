package headfirst.chapter1_strategy.Order.BetterCode;

public class OrderProcessor {
    private double totalAmount;
    private PaymentType paymentType;
    public OrderProcessor(double totalAmount){
        this.totalAmount = totalAmount;
    }
    void makePayment(PaymentType paymentType){
        this.paymentType = paymentType;
        paymentType.pay(totalAmount);

    }

}
