// Circle.java
public class Circle extends Shape {  // Inheritance example
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {  // Polymorphism example
        return Math.PI * radius * radius;
    }
}
