package Behavioral.State;

public class PressedState extends State {
    public PressedState(Transaction transaction) {
        super(transaction);
    }

    @Override
    void handle() {
        // Your implementation for pressed state transaction.
        System.out.println("handle pressed state transaction");
    }
}
