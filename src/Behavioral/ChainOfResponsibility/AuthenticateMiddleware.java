package Behavioral.ChainOfResponsibility;

public class AuthenticateMiddleware extends Middleware {
    @Override
    public boolean handle() {
        System.out.println("check if user is authenticated");

        if (!checkIfAuthenticated()) {
            System.out.println("User is not authenticated");

            return false;
        }

        return handleNext();
    }

    private boolean checkIfAuthenticated() {
        return true;
    }
}
