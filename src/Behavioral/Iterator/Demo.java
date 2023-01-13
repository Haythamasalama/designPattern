package Behavioral.Iterator;

public class Demo {
    public static void main(String[] args) {
        ConcreteCollection<String> collection = new ConcreteCollection<String>(5);
        collection.add("item 1");
        collection.add("item 2");
        collection.add("item 3");

        collection.createIterator(new ConcreteIterator<String>(collection));

        Iterator<String> iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
