package Structural.Facade;

public class Demo {
    public static void main(String[] args) {
        FinancialSystemFacade facade = new FinancialSystemFacade();

        facade.checkCredit();
        facade.buyStock("AAPL", 10);
        facade.sellStock("AAPL", 5);
    }
}
