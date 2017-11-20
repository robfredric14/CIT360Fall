package sandboxCode.jUnitTest;


public class Mammal {

    // Variables
    private int legCount;
    private String color;
    private double height;

    // Constructor function
    public Mammal(int legCount, String color, double height) {
        this.legCount = legCount;
        this.color = color;
        this.height = height;
    }

    // Getters and Setters
    public int getLegCount() {
        return legCount;
    }

    public void setLegs(int legs) {
        this.legCount = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}