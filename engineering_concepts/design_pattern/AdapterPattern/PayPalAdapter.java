package engineering_concepts.design_pattern.AdapterPattern;

public class PayPalAdapter implements PaymentProcessor{
    private PayPalGateway obj1;
    public PayPalAdapter() {
        obj1=new PayPalGateway();
    }
    @Override
    public void processPayment(double amt) {
        obj1.sendPayment(amt);
    }
}