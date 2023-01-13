package Behavioral.ChainOfResponsibility;

public class WhitelistIpMiddleware extends Middleware {
    @Override
    public boolean handle() {
        System.out.println("check if ip in database or not");

        if (!checkIp()) {
            System.out.println("Ip is not in database");
            return false;
        }

        return handleNext();
    }

    private boolean checkIp() {
        // code to check if IP is in database
        return true;
    }
}
