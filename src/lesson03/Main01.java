package lesson03;

public class Main01 {

    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.disk += "Photos";
        phone.accountName = "Sasha iphone";

        Computer pc = new Computer();
        pc.userName = "Sasha";
        pc.disk += "Photos, Videos, Games ";

        phone.transferTo(pc, phone.disk);
        System.out.println(pc.disk);
    }
}
