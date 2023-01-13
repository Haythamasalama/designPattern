package Structural.Decorator;

public class VipPlan extends BookingDecorator {
    public VipPlan(Booking booking) {
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
