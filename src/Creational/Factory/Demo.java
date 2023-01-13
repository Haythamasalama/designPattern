package Creational.Factory;

public class Demo {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());

        pizzaStore.orderPizza("margherita");
        pizzaStore.orderPizza("pepperoni");
    }
}
