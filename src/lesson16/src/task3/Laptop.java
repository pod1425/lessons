package lesson16.src.task3;

public class Laptop  extends Computer{
    private int times;

    public Laptop(double cpuFreq, int cores, int RAM, double hdd , int times) {
        super(cpuFreq, cores, RAM, hdd);
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
    @Override
    public double calculatePrice() {
        return  (super.calculatePrice() + times ) / 10;
    }
    @Override
    public boolean isRelevant() {
        return times >= 60;
    }
}
