package lesson02;

public class Human  {
    private String name;
    private int age;
    private double height;
    private static String species;

    public Human(String name, int age, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
        species = "homo sapiens";
    }

    public static void setSpecies(String species) {
        Human.species = species;
    }
    public static String getSpecies() {
        return species;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name +
                ", im " + age + " years old and " + height + " meters tall");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
