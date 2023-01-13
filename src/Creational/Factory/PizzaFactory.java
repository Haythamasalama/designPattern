package Creational.Factory;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "margherita" -> new MargheritaPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> null;
        };
    }
}
