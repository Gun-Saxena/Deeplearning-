package engineering_concepts.design_pattern.FactoryPattern;

public class WordFactory extends DocumentFactory{
    @Override
    public WordDocument createDocument() {
        return new MyWordDocument();
    }
}
