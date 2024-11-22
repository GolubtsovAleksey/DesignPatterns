package adapter;

public class USBAdapterToOldCardMemory implements USB {

    private final OldCardMemory oldCardMemory;

    public USBAdapterToOldCardMemory(OldCardMemory oldCardMemory) {
        this.oldCardMemory = oldCardMemory;
    }

    @Override
    public void usbConnect() {
        oldCardMemory.cardConnect();
    }
}
