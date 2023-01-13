package Behavioral.Observer;

public class Follower implements Listener {
    private final String username;

    public Follower(String username) {
        this.username = username;
    }

    @Override
    public void notify(String message) {
        System.out.println("New notification to @" + this.username + " : " + message);
    }
}
