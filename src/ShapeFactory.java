import java.util.Scanner;

public class ShapeFactory {
    public static Shape createShape(String shapeType, String color, Scanner scanner) {
        try {
            if (shapeType.equals("circle")) {
                System.out.println("Enter radius:");
                double radius = validateDoubleInput(scanner);
                return new Circle(color, 0, 0, radius);
            } else if (shapeType.equals("rectangle")) {
                System.out.println("Enter width:");
                double width = validateDoubleInput(scanner);
                System.out.println("Enter height:");
                double height = validateDoubleInput(scanner);
                return new Rectangle(color, 0, 0, width, height);
            } else {
                throw new IllegalArgumentException("Invalid shape type.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // Input validation for double values
    private static double validateDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a number.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }
}
