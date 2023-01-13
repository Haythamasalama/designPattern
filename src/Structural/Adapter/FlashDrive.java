package Structural.Adapter;

public class FlashDrive implements USBDrive {
    public void read() {
        System.out.println("Reading data from flash drive");
    }

    public void write() {
        System.out.println("Writing data to flash drive");
    }
}