package lesson04;

public class Human {
    private String name;
    private Pet pet;

    public Human(String name) {
        this.name = name;
    }

    public void askAboutPet() {
        System.out.println("I have a " + pet.getClass().getSimpleName() + " named " + pet.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
