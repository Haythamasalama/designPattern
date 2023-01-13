package Behavioral.State;

public class Transaction {
    private State state;

    public Transaction() {
        this.state = new PendingState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        this.state.handle();
    }
}
