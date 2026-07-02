package lesson03;

import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private double height;

    public Human(String name, int age, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name +
                ", im " + age + " years old and " + height + " meters tall");
    }

    @Override
    public int hashCode() {
        /*int hash = 1;
        for (int i = 0; i < name.length(); i++) {
            hash += 10 + name.charAt(i) * 13;
        }
        hash *= age;
        hash = (int)(hash * height);*/
        return Objects.hash(name, age, height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Human) {
            Human h = (Human) obj;

            return h.getAge() == this.getAge()
                    && h.getName().equals(this.getName())
                    && h.getHeight() == this.getHeight();
        }
        return false;
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
