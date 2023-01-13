package Behavioral.ChainOfResponsibility;

public class ThrottlingMiddleware extends Middleware {
    private final int requestPerMinute;
    private final int request;

    public ThrottlingMiddleware(int requestPerMinute, int request) {
        this.requestPerMinute = requestPerMinute;
        this.request = request;
    }

    @Override
    public boolean handle() {
        System.out.println("handle the functionality for throttling");

        if (checkThrottling()) {
            System.out.println("Request is throttled");

            return false;
        }

        return handleNext();
    }

    private boolean checkThrottling() {
        // code to check if request is throttled
        return false;
    }
}
