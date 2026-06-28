package engineering_concepts.design_pattern.DecoratorPattern;

public abstract class NotifierDecorator implements Notifier{
    protected Notifier n;
    public NotifierDecorator(Notifier n){
        this.n=n;
    }
    @Override
    public void send(){
        n.send();
    }
}