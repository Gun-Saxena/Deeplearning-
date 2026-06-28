package engineering_concepts.design_pattern.ProxyPattern;


public class RealImage implements Image{
    private String fn;
    public RealImage(String fn){
        this.fn=fn;
        loadImage();
    }
    private void loadImage(){
        System.out.println("Loading image from remote server:"+fn);
    }
    @Override
    public void display(){
        System.out.println("Displaying image:"+fn);
    }

}