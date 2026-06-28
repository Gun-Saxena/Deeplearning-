package engineering_concepts.design_pattern.FactoryPattern;

public class MyWordDocument implements WordDocument{
    @Override
    public void open() {
        System.out.println("Word Document Created");
    }
}