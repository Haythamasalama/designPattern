package Behavioral.Iterator;

public class ConcreteCollection<T> implements Collection<T> {
    private final T[] items;
    private int size = 0;
    private Iterator<T> iterator;

    public ConcreteCollection(int size) {
        this.items = (T[]) new Object[size];
    }

    public void add(T item) {
        this.items[size++] = item;
    }

    public int getSize() {
        return size;
    }

    public T[] getItems() {
        return items;
    }

    @Override
    public void createIterator(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    public Iterator<T> getIterator() {
        return this.iterator;
    }
}
