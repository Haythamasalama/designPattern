package Structural.Bridge;

public class Demo {
    public static void main(String[] args) {
        Application app = new ApplicationA(new Windows());
        app.develop();
    }
}
