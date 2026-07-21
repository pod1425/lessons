package lesson05.coffeemachine;

public class Recipe {
    private String name;
    private int price;
    private int cupsnumber;
    private int milknumber;
    private int waternumber;
    private int powdernumber;

    public Recipe(String name, int price, int cupsnumber, int milknumber, int waternumber, int powdernumber) {
        this.name = name;
        this.price = price;
        this.cupsnumber = cupsnumber;
        this.milknumber = milknumber;
        this.waternumber = waternumber;
        this.powdernumber = powdernumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCupsnumber() {
        return cupsnumber;
    }

    public void setCupsnumber(int cupsnumber) {
        this.cupsnumber = cupsnumber;
    }

    public int getMilknumber() {
        return milknumber;
    }

    public void setMilknumber(int milknumber) {
        this.milknumber = milknumber;
    }

    public int getWaternumber() {
        return waternumber;
    }

    public void setWaternumber(int waternumber) {
        this.waternumber = waternumber;
    }

    public int getPowdernumber() {
        return powdernumber;
    }

    public void setPowdernumber(int powdernumber) {
        this.powdernumber = powdernumber;
    }
}


