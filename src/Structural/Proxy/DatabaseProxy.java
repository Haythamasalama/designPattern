package Structural.Proxy;

public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private boolean connected;

    public void connect() {
        if (!connected) {
            realDatabase = new RealDatabase();
            realDatabase.connect();
            connected = true;
        }
    }

    public void disconnect() {
        if (connected) {
            realDatabase.disconnect();
            connected = false;
        }
    }

    public void executeQuery(String query) {
        if (connected) {
            realDatabase.executeQuery(query);
        } else {
            System.out.println("Not connected to the real database");
        }
    }
}