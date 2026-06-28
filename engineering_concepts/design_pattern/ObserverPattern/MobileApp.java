package engineering_concepts.design_pattern.ObserverPattern;

public class MobileApp implements Observer{
    private String u;
    public MobileApp(String u){
        this.u=u;
    }
    @Override
    public void update(String sn,double p){
        System.out.println(u+"(Mobile App) received update:"+sn+"= Rs"+p);
    }
}