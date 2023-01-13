package Structural.Decorator;

class BasicPlan implements Booking {
    @Override
    public String getTitle() {
        return "this Basic plan";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
