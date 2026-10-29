package lesson16.src.task3;

public class Computer {
    protected double cpuFreq;
    protected int cores;
    protected int RAM;
    protected double hdd ;

    public Computer(double cpuFreq, int cores, int RAM, double hdd) {
        this.cpuFreq = cpuFreq;
        this.cores = cores;
        this.RAM = RAM;
        this.hdd = hdd;
    }

    public double getCpuFreq() {
        return cpuFreq;
    }

    public void setCpuFreq(double cpuFreq) {
        this.cpuFreq = cpuFreq;
    }

    public double getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getHdd() {
        return hdd;
    }

    public void setHdd(double hdd) {
        this.hdd = hdd;
    }

    public double calculatePrice() {
        return (cpuFreq * cores) / 100 + (RAM / 80.0) + (hdd / 20);
    }
    public boolean isRelevant() {
        return cpuFreq >= 2000
                && cores >= 2
                && RAM >= 2048
                && hdd >= 320;
    }

    public  void information (){
        System.out.println("Частота " + cpuFreq + " МГц ");
        System.out.println("Кількість ядер " + cores );
        System.out.println("обсяг пам'яті " + RAM + " МБ ");
        System.out.println("обсяг жорсткого диска " + hdd + " ГБ ");
    }
}
