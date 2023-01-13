package Behavioral.TemplateMethod;

public class WordFileImporter extends FileImporter {
    @Override
    public void readFile() {
        System.out.println("read data from word file...");
    }
}
