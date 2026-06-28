package engineering_concepts.design_pattern.FactoryPattern;

public class ExcelFactory extends DocumentFactory {
    @Override
    public ExcelDocument createDocument() {
        return new MyExcelDocument();
    }
}