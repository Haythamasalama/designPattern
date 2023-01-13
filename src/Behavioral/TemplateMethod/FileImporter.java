package Behavioral.TemplateMethod;

public abstract class FileImporter {
    public void openFile() {
        System.out.println("open file...");
    }

    public void closeFile() {
        System.out.println("close file...");
    }

    abstract void readFile();

    final public void importFile() {
        this.openFile();
        this.readFile();
        this.closeFile();
    }
}
