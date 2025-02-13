// Shape.java
public abstract class Shape {
    protected String color;
    private double x, y;  // Encapsulation example

    public Shape(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();  // Abstraction example

    public String getColor() {
        return color;
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
