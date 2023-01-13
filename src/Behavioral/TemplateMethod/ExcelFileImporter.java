package Behavioral.TemplateMethod;

public class ExcelFileImporter extends FileImporter {
    @Override
    public void readFile() {
        System.out.println("read data from excel file...");
    }
}
