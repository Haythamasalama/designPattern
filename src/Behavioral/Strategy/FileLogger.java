package Behavioral.Strategy;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        // Your implementation for logging to file.
        System.out.println("[file]:" + message);
    }
}
