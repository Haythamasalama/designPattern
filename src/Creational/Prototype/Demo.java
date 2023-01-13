package Creational.Prototype;

public class Demo {
    public static void main(String[] args) {
        FordPrototype fordPrototype = new FordPrototype();
        
        FordPrototype ford1 = (FordPrototype) fordPrototype.clone();
        ford1.setColor("Blue");

        FordPrototype ford2 = (FordPrototype) fordPrototype.clone();
        ford2.setEngineSize("5.5L");
    }
}
