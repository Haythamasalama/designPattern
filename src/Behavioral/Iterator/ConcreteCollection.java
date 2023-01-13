package Behavioral.Iterator;

public class ConcreteCollection<T> implements Collection<T> {
    private final T[] items;
    private int size;

    public ConcreteCollection(int size) {
        items = (T[]) new Object[size];
        this.size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(this);
    }

    @Override
    public void add(T item) {
        items[size] = item;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    public T get(int index) {
        return items[index];
    }
}
