package engineering_concepts.design_pattern.StrategyPattern;

public class Main {
    public static void main(String[] args){
        PaymentContext c=new PaymentContext(new CreditCardPayment());
        c.executePayment(5000);
        c.setPaymentStrategy(new PayPalPayment());
        c.executePayment(3000);
    }
}