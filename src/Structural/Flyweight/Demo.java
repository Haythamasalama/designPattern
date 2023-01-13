package Structural.Flyweight;

public class Demo {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();
        
        Tree tree1 = treeFactory.getTree("cone", "green");
        tree1.render(1, 2);

        Tree tree2 = treeFactory.getTree("cone", "green");
        tree2.render(3, 4);

        Tree tree3 = treeFactory.getTree("cone", "green");
        tree3.render(5, 6);
    }
}
