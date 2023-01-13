package Behavioral.State;

public abstract class State {
    protected Transaction transaction;

    public State(Transaction transaction) {
        this.transaction = transaction;
    }

    abstract void handle();
}
