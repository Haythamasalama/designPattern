package Structural.Flyweight;

public class OakTree implements Tree {
    private final String shape;
    private final String color;
    private int x;
    private int y;

    public OakTree(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void render(int x, int y) {
        setX(x);
        setY(y);
        System.out.println("Render Oak tree with shape: " + shape + " and color: " + color + " at x: " + x + " y: " + y);
    }
}