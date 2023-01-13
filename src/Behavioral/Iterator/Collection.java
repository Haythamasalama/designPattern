package Behavioral.Iterator;

public interface Collection<T> {
    Iterator<T> iterator();

    void add(T item);

    int size();
}
