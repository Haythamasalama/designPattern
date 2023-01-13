package Creational.Builder;

public class Demo {
    public static void main(String[] args) {
        new Car.Builder()
                .setMaker("Toyota")
                .setModel("Camry")
                .setYear(2018)
                .setColor("Red")
                .setAutomatic(true)
                .build();
    }
}
