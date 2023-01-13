package Behavioral.State;

public class Demo {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.request();

        transaction.setState(new ApprovingState(transaction));
        transaction.request();

        transaction.setState(new PressedState(transaction));
        transaction.request();
    }
}
