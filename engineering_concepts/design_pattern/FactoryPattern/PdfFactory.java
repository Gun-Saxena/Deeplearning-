package engineering_concepts.design_pattern.FactoryPattern;

public class PdfFactory extends DocumentFactory {
    @Override
    public PdfDocument createDocument() {
        return new MyPdfDocument();
    }
}
