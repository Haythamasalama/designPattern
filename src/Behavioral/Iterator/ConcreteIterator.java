package Behavioral.Iterator;

public class ConcreteIterator<T> implements Iterator<T> {
    private final ConcreteCollection<T> collection;
    private int position;

    public ConcreteIterator(ConcreteCollection<T> collection) {
        this.collection = collection;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < collection.size();
    }

    @Override
    public T next() {
        T item = collection.get(position);
        position++;
        return item;
    }
}
