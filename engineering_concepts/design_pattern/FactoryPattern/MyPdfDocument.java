package engineering_concepts.design_pattern.FactoryPattern;

public class MyPdfDocument implements PdfDocument{
    @Override
    public void open() {
        System.out.println("PDF Document Created");
    }
}