package engineering_concepts.design_pattern.ObserverPattern;

public class WebApp implements Observer{
    private String u;
    public WebApp(String u){
        this.u=u;
    }
    @Override
    public void update(String sn,double p){
        System.out.println(u+"(Web App) received update:"+sn+"=Rs"+p);
    }
}