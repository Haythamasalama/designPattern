package Behavioral.ChainOfResponsibility;

public class Demo {
    public static void main(String[] args) {

        Middleware middleware = new AuthenticateMiddleware()
                .setNextHandler(new WhitelistIpMiddleware())
                .setNextHandler(new ThrottlingMiddleware(10, 1));

        if (middleware.handle()) {
            System.out.println("Request is valid");
        } else {
            System.out.println("Request is invalid");
        }
    }
}
