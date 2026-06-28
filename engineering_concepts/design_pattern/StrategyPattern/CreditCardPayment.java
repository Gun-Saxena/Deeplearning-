package engineering_concepts.design_pattern.StrategyPattern;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amt){
        System.out.println("Paid Rs "+amt+" using Credit Card");
    }

}
