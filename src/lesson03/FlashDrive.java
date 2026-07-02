package lesson03;

public class FlashDrive implements Usb {
    public String storage;
    @Override
    public void transferTo(Usb device, String data) {
        device.receive(this, data);
    }

    @Override
    public void receive(Usb device, String data) {
        storage += "[Data]: " + data;
    }
}
