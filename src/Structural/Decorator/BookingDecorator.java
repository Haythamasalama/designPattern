package Structural.Decorator;

public abstract class BookingDecorator implements Booking {
    protected Booking booking;

    public BookingDecorator(Booking booking) {
        this.booking = booking;
    }
}
