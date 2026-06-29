package engineering_concepts.design_pattern.DecoratorPattern;

public class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier n){
        super(n);
    }
    @Override
    public void send(){
        super.send();
        System.out.println("Notification via SMS");
    }
}
