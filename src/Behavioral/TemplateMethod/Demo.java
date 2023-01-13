package Behavioral.TemplateMethod;

public class Demo {
    public static void main(String[] args) {
        ExcelFileImporter excelFileImporter = new ExcelFileImporter();
        excelFileImporter.importFile();

        WordFileImporter wordFileImporter = new WordFileImporter();
        wordFileImporter.importFile();
    }
}
