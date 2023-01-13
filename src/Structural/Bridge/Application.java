package Structural.Bridge;

public abstract class Application {
    protected Platform platform;

    public Application(Platform platform) {
        this.platform = platform;
    }

    abstract void develop();
}
