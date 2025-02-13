
// Rectangle.java
// Inheritance: Rectangle inherits from Shape class
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double x, double y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    // Polymorphism: Override parent class method with specific implementation
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Polymorphism: Different price calculation for Rectangle
    @Override
    public double calculatePrice() {
        double basePrice = 80 * calculateArea();
        return color.equalsIgnoreCase("blue") ? basePrice * 1.3 : basePrice;
    }
}