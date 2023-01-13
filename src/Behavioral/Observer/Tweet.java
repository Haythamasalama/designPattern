package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Tweet implements Event {
    private final String text;
    private final List<Listener> listeners;

    public Tweet(String text) {
        this.text = text;
        this.listeners = new ArrayList<>();
    }

    @Override
    public void subscribe(Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void unsubscribe(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void notifyToAll() {
        this.listeners.forEach((listener -> listener.notify(text)));
    }
}
