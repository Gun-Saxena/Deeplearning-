package engineering_concepts.design_pattern.DecoratorPattern;

public class EmailNotifier implements Notifier{
    @Override
    public void send(){
        System.out.println("Notification via Email");
    }
}
