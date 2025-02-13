// Main.java
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Shape> shapes = new ArrayList<>();

            while (true) {
                System.out.println("Enter shape (circle/rectangle/exit):");
                String shape = scanner.nextLine().toLowerCase();

                if (shape.equals("exit")) break;

                System.out.println("Enter color:");
                String color = scanner.nextLine();

                if (shape.equals("circle")) {
                    System.out.println("Enter radius:");
                    double radius = scanner.nextDouble();
                    scanner.nextLine(); // Consume the leftover newline
                    shapes.add(new Circle(color, 0, 0, radius));
                } else if (shape.equals("rectangle")) {
                    System.out.println("Enter width and height:");
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    scanner.nextLine(); // Consume the leftover newline
                    shapes.add(new Rectangle(color, 0, 0, width, height));
                }
            }

            for (Shape shapeObj : shapes) {
                LOGGER.info(String.format("%s shape - Area: %.2f, Price: $%.2f",
                        shapeObj.getColor(), shapeObj.calculateArea(), shapeObj.calculatePrice()));
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error processing shapes", e);
        }
    }
}
