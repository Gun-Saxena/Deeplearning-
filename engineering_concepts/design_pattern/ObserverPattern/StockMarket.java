package engineering_concepts.design_pattern.ObserverPattern;

import java.util.ArrayList;
public class StockMarket implements Stock{
    private ArrayList<Observer> l=new ArrayList<>();
    private String sn;
    private double p;
    @Override
    public void register(Observer ob){
        l.add(ob);
    }
    @Override
    public void deregister(Observer ob){
        l.remove(ob);
    }
    @Override
    public void notifyObservers(){
        for (Observer ob:l){
            ob.update(sn,p);
        }
    }
    public void setStockPrice(String sn,double p){
        this.sn=sn;
        this.p=p;
        System.out.println("\nStock Price Updated:");
        System.out.println(sn+"=Rs"+p);
        notify();
    }
}
