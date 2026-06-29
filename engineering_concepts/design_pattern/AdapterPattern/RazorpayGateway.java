package engineering_concepts.design_pattern.AdapterPattern;

public class RazorpayGateway {
    public void pay(double amt) {
        System.out.println("Payment by using Razorpay "+amt);
    }
}
