package Structural.Proxy;

public class RealDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to real database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from real database...");
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query + " on real database");
    }
}