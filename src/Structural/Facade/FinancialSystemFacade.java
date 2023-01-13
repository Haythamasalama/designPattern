package Structural.Facade;

public class FinancialSystemFacade {
    private final BankAccount bankAccount;
    private final StockPortfolio stockPortfolio;
    private final CreditRating creditRating;

    public FinancialSystemFacade() {
        bankAccount = new BankAccount();
        stockPortfolio = new StockPortfolio();
        creditRating = new CreditRating();
    }

    public void checkCredit() {
        creditRating.check();
    }

    public void buyStock(String stock, int shares) {
        bankAccount.withdraw(shares * 100);

        stockPortfolio.buy(stock, shares);
    }

    public void sellStock(String stock, int shares) {
        stockPortfolio.sell(stock, shares);

        bankAccount.deposit(shares * 110);
    }
}
