package Structural.Adapter;

public class Demo {
    public static void main(String[] args) {
        MemoryCard sdCard = new SDMemoryCard();
        sdCard.readData();
        sdCard.writeData();

        USBDrive flashDrive = new FlashDrive();
        MemoryCard adapter = new USBCardReaderAdapter(flashDrive);
        adapter.readData();
        adapter.writeData();
    }
}

