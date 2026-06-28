package engineering_concepts.design_pattern.AdapterPattern;

public class RazorpayAdapter implements PaymentProcessor{
    private RazorpayGateway obj1;
    public RazorpayAdapter(){
        obj1=new RazorpayGateway();
    }
    @Override
    public void processPayment(double amt){
        obj1.pay(amt);
    }
}