package engineering_concepts.design_pattern.AdapterPattern;

public class Main {
    public static void main(String[] args){
        PaymentProcessor p=new PayPalAdapter();
        p.processPayment(5000);
        PaymentProcessor r=new RazorpayAdapter();
        r.processPayment(2000);
    }
}
