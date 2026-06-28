package engineering_concepts.design_pattern.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        WordFactory wf = new WordFactory();
        WordDocument word = wf.createDocument();
        word.open();
        PdfFactory pf = new PdfFactory();
        PdfDocument pdf = pf.createDocument();
        pdf.open();
        ExcelFactory ef = new ExcelFactory();
        ExcelDocument excel = ef.createDocument();
        excel.open();
    }
}