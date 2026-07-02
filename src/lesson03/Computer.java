package lesson03;

public class Computer implements Bluetooth, Usb {
    public String disk = "";
    public String userName;


    @Override
    public void transferTo(Bluetooth device, String data) {
        defaultTransfer(device, data);
    }

    @Override
    public void receive(Bluetooth device, String data) {
        disk += "[From " + device.getIdentifier() + "]: " + data;
    }

    @Override
    public String getIdentifier() {
        return userName;
    }

    @Override
    public void transferTo(Usb device, String data) {
        device.receive(this, data);
    }

    @Override
    public void receive(Usb device, String data) {
        disk += "[Data from USB]:" + data;
    }
}
