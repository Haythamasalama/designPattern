package Behavioral.State;

public class ApprovingState extends State {
    public ApprovingState(Transaction transaction) {
        super(transaction);
    }

    @Override
    void handle() {
        // Your implementation for approved state transaction.
        System.out.println("handle approved state transaction");
    }
}
