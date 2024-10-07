import java.util.Comparator;
import java.util.List;

public class OrderPrinter {
    public void printShapesInOrder(List<Shape> shapes) {
        shapes.sort(Comparator.comparing(Shape::calculateArea).thenComparing(Shape::getX).thenComparing(Shape::getY));

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Position: " + shape.getX() + ", " + shape.getY());
            System.out.println("\n\n");
        }
    }
}
