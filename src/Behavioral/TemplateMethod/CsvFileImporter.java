package Behavioral.TemplateMethod;

public class CsvFileImporter extends FileImporter {
    @Override
    public void readFile() {
        System.out.println("read data from csv file...");
    }
}
