package Structural.Composite;

public class File implements FileSystemComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println(name);
    }
}
