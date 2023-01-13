package Behavioral.ChainOfResponsibility;

public abstract class Middleware {
    private Middleware next;

    public Middleware setNextHandler(Middleware next) {
        this.next = next;

        return next;
    }

    public abstract boolean handle();

    protected boolean handleNext() {
        if (next == null) {
            return true;
        }

        return next.handle();
    }
}
