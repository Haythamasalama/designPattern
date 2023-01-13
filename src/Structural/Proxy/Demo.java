package Structural.Proxy;

public class Demo {
    public static void main(String[] args) {
        Database proxy = new DatabaseProxy();
        
        proxy.connect();
        proxy.executeQuery("SELECT * FROM users");
        proxy.disconnect();
    }
}
