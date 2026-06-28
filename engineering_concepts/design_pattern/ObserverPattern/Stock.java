package engineering_concepts.design_pattern.ObserverPattern;

public interface Stock{
    void register(Observer ob);
    void deregister(Observer ob);
    void notifyObservers();
}