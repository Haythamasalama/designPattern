package Structural.Decorator;

public class ProPlan extends BookingDecorator {
    public ProPlan(Booking booking) {
        super(booking);
    }

    @Override
    public String getTitle() {
        return "Pro Plan";
    }

    @Override
    public double getPrice() {
        return this.booking.getPrice() + 10;
    }
}
