package lesson16.src.task3;

public class Tablet extends Computer{
    private int weight;
    public Tablet(double cpuFreq, int cores, int RAM, double hdd ,int weight ) {
        super(cpuFreq, cores, RAM, hdd);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public double calculatePrice(){
        return super.calculatePrice() / 10;
    }
}
