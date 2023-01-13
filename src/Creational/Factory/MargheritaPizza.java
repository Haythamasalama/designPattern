package Creational.Factory;

class MargheritaPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Margherita Pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Margherita Pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Margherita Pizza...");
    }
}
