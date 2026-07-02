package lesson03;

public class Smartphone implements Bluetooth {
    public String disk = "";

    public String accountName;

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
        return accountName;
    }
}
