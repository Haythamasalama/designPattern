package Structural.Adapter;

public class USBCardReaderAdapter implements MemoryCard {
    private final USBDrive flashDrive;

    public USBCardReaderAdapter(USBDrive flashDrive) {
        this.flashDrive = flashDrive;
    }

    public void readData() {
        flashDrive.read();
    }

    public void writeData() {
        flashDrive.write();
    }
}