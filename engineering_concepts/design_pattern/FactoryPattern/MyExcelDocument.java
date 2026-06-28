package engineering_concepts.design_pattern.FactoryPattern;

public class MyExcelDocument implements ExcelDocument {
    @Override
    public void open() {
        System.out.println("Excel Document Created");
    }
}
