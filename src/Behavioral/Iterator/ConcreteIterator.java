package Behavioral.Iterator;

public class ConcreteIterator<T> implements Iterator<T> {
    private final ConcreteCollection<T> collection;
    private int index = 0;

    public ConcreteIterator(ConcreteCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getSize();
    }

    @Override
    public T next() {
        return collection.getItems()[index++];
    }
}
