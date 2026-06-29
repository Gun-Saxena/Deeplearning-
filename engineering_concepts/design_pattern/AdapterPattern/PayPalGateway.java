package engineering_concepts.design_pattern.AdapterPattern;

public class PayPalGateway {
    public void sendPayment(double amt) {
        System.out.println("Payment by using PayPal "+ amt);
    }
}
