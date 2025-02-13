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
            boolean isInputComplete = false;

            while (!isInputComplete) {
                System.out.println("Enter shape (circle/rectangle/exit):");
                String shape = scanner.nextLine().toLowerCase();

                if (shape.equals("exit")) {
                    isInputComplete = true; // Exit the loop once done
                    continue;
                }

                System.out.println("Enter color:");
                String color = scanner.nextLine();

                if (shape.equals("circle")) {
                    System.out.println("Enter radius:");
                    if (scanner.hasNextDouble()) {
                        double radius = scanner.nextDouble();
                        shapes.add(new Circle(color, 0, 0, radius));
                    } else {
                        System.out.println("Invalid radius! Please enter a number.");
                        scanner.next(); // Clear invalid input
                        continue;
                    }
                } else if (shape.equals("rectangle")) {
                    System.out.println("Enter width and height:");
                    if (scanner.hasNextDouble()) {
                        double width = scanner.nextDouble();
                        double height = scanner.nextDouble();
                        shapes.add(new Rectangle(color, 0, 0, width, height));
                    } else {
                        System.out.println("Invalid dimensions! Please enter numbers.");
                        scanner.next(); // Clear invalid input
                        continue;
                    }
                } else {
                    System.out.println("Invalid shape! Please enter circle or rectangle.");
                    continue;
                }

                scanner.nextLine(); // Clear the buffer
                System.out.println("Do you want to add another shape? (yes/no):");
                String choice = scanner.nextLine().toLowerCase();
                if (choice.equals("no")) {
                    isInputComplete = true;
                }
            }

            // Main Calculation Code (after all inputs are gathered)
            if (!shapes.isEmpty()) {
                for (Shape shape : shapes) {
                    LOGGER.info(String.format("%s shape - Area: %.2f, Price: $%.2f",
                            shape.getColor(), shape.calculateArea(), shape.calculatePrice()));
                }
            } else {
                System.out.println("No shapes were entered.");
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error processing shapes", e);
        }
    }
}
