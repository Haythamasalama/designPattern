package Behavioral.State;

public class PendingState extends State {
    public PendingState(Transaction transaction) {
        super(transaction);
    }

    @Override
    void handle() {
        // Your implementation for pending state transaction.
        System.out.println("handle pending state transaction");
    }
}
