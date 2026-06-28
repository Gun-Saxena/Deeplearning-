package engineering_concepts.design_pattern.ProxyPattern;

public class Main{
    public static void main(String[] args){
        Image i=new ProxyImage("photo.jpg");
        System.out.println("First Display:");
        i.display();
        System.out.println("Second Display:");
        i.display();
    }
}