

// Main.java
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            ArrayList<Shape> shapes = new ArrayList<>();
            shapes.add(new Circle("Red", 0, 0, 5));
            shapes.add(new Rectangle("Blue", 2, 3, 4, 6));

            for (Shape shape : shapes) {
                LOGGER.info(String.format("%s shape area: %.2f",
                        shape.getColor(), shape.calculateArea()));
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error processing shapes", e);
        }
    }
}