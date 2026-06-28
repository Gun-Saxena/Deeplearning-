package engineering_concepts.design_pattern.StrategyPattern;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amt) {
        System.out.println("Paid Rs "+amt+" using PayPal");
    }
}