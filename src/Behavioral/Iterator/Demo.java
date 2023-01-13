package Behavioral.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<String> collection = new ConcreteCollection<>(5);
        collection.add("item 1");
        collection.add("item 2");
        collection.add("item 3");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
