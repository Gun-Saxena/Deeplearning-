package engineering_concepts.design_pattern.DecoratorPattern;

public class Main{
    public static void main(String[] args){
        System.out.println("Email Notification:");
        Notifier e=new EmailNotifier();
        e.send();
        System.out.println();
        System.out.println("Email+SMS Notification:");
        Notifier sms=new SMSNotifierDecorator(new EmailNotifier());
        sms.send();
        System.out.println();
        System.out.println("Email+SMS+Slack Notification:");
        Notifier ob=new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        ob.send();
    }
}