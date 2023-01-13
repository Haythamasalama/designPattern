package Behavioral.Strategy;

public class Demo {
    public static void main(String[] args) {
        Log log = new Log(new FileLogger());
        log.error("tests log error file,Strategy Pattern.");
        log.info("tests log info file,Strategy Pattern.");

        log.setLogger(new ConsoleLogger());
        log.error("tests log error console,Strategy Pattern.");
        log.info("tests log info console,Strategy Pattern.");
    }
}
