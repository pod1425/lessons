package lesson03;

public interface Bluetooth {

    void transferTo(Bluetooth device, String data);
    void receive(Bluetooth device, String data);

    String getIdentifier();

    default void defaultTransfer(Bluetooth device, String data) {
        device.receive(this, data);
    }
}
