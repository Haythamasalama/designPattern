package Structural.Facade;

public class StockPortfolio {
    public void buy(String stock, int shares) {
        System.out.println("Buy " + shares + " shares of " + stock + " stock");
    }

    public void sell(String stock, int shares) {
        System.out.println("Sell " + shares + " shares of " + stock + " stock");
    }
}
