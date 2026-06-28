package engineering_concepts.design_pattern.ProxyPattern;


public class ProxyImage implements Image{
    private RealImage ri;
    private String fn;
    public ProxyImage(String fn){
        this.fn=fn;
    }
    @Override
    public void display(){
        if (ri==null){
            ri=new RealImage(fn);
        }
        ri.display();
    }
}