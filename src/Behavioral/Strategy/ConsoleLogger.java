package Behavioral.Strategy;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        // Your implementation for logging to console.
        System.out.println("[console]:" + message);
    }
}
