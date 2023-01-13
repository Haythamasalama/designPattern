package Structural.Adapter;

class SDMemoryCard implements MemoryCard {
    public void readData() {
        System.out.println("Reading data from SD memory card");
    }

    public void writeData() {
        System.out.println("Writing data to SD memory card");
    }
}