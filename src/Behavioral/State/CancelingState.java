package Behavioral.State;

public class CancelingState extends State {
    public CancelingState(Transaction transaction) {
        super(transaction);
    }

    @Override
    void handle() {
        // Your implementation for canceled state transaction.
        System.out.println("handle canceled state transaction");
    }
}
