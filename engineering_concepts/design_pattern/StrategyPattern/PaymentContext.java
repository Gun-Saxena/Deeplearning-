package engineering_concepts.design_pattern.StrategyPattern;

public class PaymentContext{
    private PaymentStrategy p;
    public PaymentContext(PaymentStrategy p){
        this.p=p;
    }
    public void setPaymentStrategy(PaymentStrategy p){
        this.p=p;
    }
    public void executePayment(double amt) {
        p.pay(amt);
    }

}