package engineering_concepts.design_pattern.DecoratorPattern;

public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier n){
        super(n);
    }
    @Override
    public void send(){
        super.send();
        System.out.println("Notification sent via Slack");
    }
}
