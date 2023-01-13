package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    public void showName() {
        System.out.println(name);
        for (FileSystemComponent child : children) {
            child.showName();
        }
    }
}
