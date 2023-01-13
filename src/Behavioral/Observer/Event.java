package Behavioral.Observer;

public interface Event {
    void subscribe(Listener listener);
    void unsubscribe(Listener listener);
    void notifyToAll();
}
