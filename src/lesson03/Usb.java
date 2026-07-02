package lesson03;

public interface Usb {
    void transferTo(Usb device, String data);
    void receive(Usb device, String data);
}
