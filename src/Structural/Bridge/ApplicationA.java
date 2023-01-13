package Structural.Bridge;

public class ApplicationA extends Application {
    public ApplicationA(Platform platform) {
        super(platform);
    }

    @Override
    void develop() {
        platform.execute("Application A");
    }
}
