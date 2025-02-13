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
            // Polymorphism: ArrayList<Shape> can store any Shape subclass
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
                    shapes.add(new Circle(color, 0, 0, radius));
                } else if (shape.equals("rectangle")) {
                    System.out.println("Enter width and height:");
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    shapes.add(new Rectangle(color, 0, 0, width, height));
                }
                scanner.nextLine();
            }

            // Polymorphism: Correct version of calculateArea/Price called based on actual object type
            for (Shape shape : shapes) {
                LOGGER.info(String.format("%s shape - Area: %.2f, Price: $%.2f",
                        shape.getColor(), shape.calculateArea(), shape.calculatePrice()));
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error processing shapes", e);
        }
    }
}