package Structural.Composite;

public class Demo {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        root.add(home);
        home.add(user);
        user.add(file1);
        user.add(file2);

        root.showName();
    }
}
