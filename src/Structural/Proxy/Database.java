package Structural.Proxy;

public interface Database {
    void connect();

    void disconnect();

    void executeQuery(String query);
}
