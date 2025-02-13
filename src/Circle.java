// Circle.java
// Inheritance: Circle inherits from Shape class
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    // Polymorphism: Override parent class method with specific implementation
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Polymorphism: Different price calculation for Circle
    @Override
    public double calculatePrice() {
        double basePrice = 100 * calculateArea();
        return color.equalsIgnoreCase("red") ? basePrice * 1.5 : basePrice;
    }
}