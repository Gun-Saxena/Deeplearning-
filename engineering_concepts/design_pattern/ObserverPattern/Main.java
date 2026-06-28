package engineering_concepts.design_pattern.ObserverPattern;

public class Main{
    public static void main(String[] args){
        StockMarket s=new StockMarket();
        Observer m =new MobileApp("xyz");
        Observer w=new WebApp("abc");
        s.register(m);
        s.register(w);
        s.setStockPrice("TCS", 3500);
        s.deregister(w);
        s.setStockPrice("TCS", 3600);
    }
}
