package Behavioral.Strategy;

public class Log {

    private Logger logger;

    public Log(Logger logger) {
        this.logger = logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void info(String message) {
        this.logger.log("[info]:" + message);
    }

    public void error(String message) {
        this.logger.log("[error]:" + message);
    }
}
