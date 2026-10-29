package lesson16.src.task2;



public class City {
    private String name;
    private int population;
    private int postIndex;
    private CityType type;
    private int foundedYear;
    private int medianSalary;
    private int area;
    private String country;

    public City(String name, int population, int postIndex, CityType type, int foundedYear, int medianSalary, int area, String country) {
        this.name = name;
        this.population = population;
        this.postIndex = postIndex;
        this.type = type;
        this.foundedYear = foundedYear;
        this.medianSalary = medianSalary;
        this.area = area;
        this.country = country;
    }

    public City(){
        name = "";
        population = 0;
        postIndex = 0;
        type = CityType.CITY;
        foundedYear = 0;
        medianSalary = 0;
        area = 0;
        country = "";
    }

    public String getName() {
        return name;
    }
    public int getPopulation(){
        return population;
    }
    public int getPostIndex(){
        return postIndex;
    }

    public CityType getType() {
        return type;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public int getMedianSalary() {
        return medianSalary;
    }

    public int getArea() {
        return area;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public void setType(CityType type) {
        this.type = type;
    }

    public void setMedianSalary(int medianSalary) {
        this.medianSalary = medianSalary;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void say(){
        System.out.println("its " + getName() +  "part of" + country);
    }

}
