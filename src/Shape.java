// Shape.java
// Abstraction: Abstract class defines common interface but hides implementation details
public abstract class Shape {
    // Encapsulation: Protected/private fields with controlled access
    protected String color;
    private double x, y;

    public Shape(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Abstraction: Abstract methods force subclasses to provide implementation
    public abstract double calculateArea();
    public abstract double calculatePrice();

    // Encapsulation: Public getter method controls access to private field
    public String getColor() {
        return color;
    }
}

