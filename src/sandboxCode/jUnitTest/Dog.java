package sandboxCode.jUnitTest;


//Dog inherits Mammal

public class Dog extends Mammal {

    private String breed;
    private String name;

    // Constructor function

    public Dog(int legCount, String color, double height, String breed, String name) {
        super(legCount, color, height);
        this.breed = breed;
        this.name = name;
    }

    // Getter and Setter methods

    public String getBreed() {
        return breed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // toString


    @Override
    public String toString() {
        return "legCount: " + getLegCount() + "\ncolor: " + getColor() + "\nheight: " + getHeight() + "\nbreed: " + breed + "\nname: " + name;
    }
}