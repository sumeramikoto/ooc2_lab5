import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderPrinterTest {
    @Test
    public void areaOrderTest() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1, 1, 2));
        shapes.add(new Square(0, 0, 3));
        shapes.add(new Rectangle(2, 2, 2, 5));

        OrderPrinter printer = new OrderPrinter();
        printer.printShapesInOrder(shapes);

        assertTrue(shapes.get(0) instanceof Square);
        assertTrue(shapes.get(1) instanceof Rectangle);
        assertTrue(shapes.get(2) instanceof Circle);
    }

    @Test
    public void areaByXOrderTest() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(3, 1, 4));
        shapes.add(new Square(1, 2, 4));
        shapes.add(new Square(2, 3, 4));

        OrderPrinter printer = new OrderPrinter();
        printer.printShapesInOrder(shapes);

        assertEquals(1, shapes.get(0).getX());
        assertEquals(2, shapes.get(1).getX());
        assertEquals(3, shapes.get(2).getX());
    }

    @Test
    public void areaByYOrderTest() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(1, 5, 4));
        shapes.add(new Square(1, 3, 4));
        shapes.add(new Square(1, 1, 4));

        OrderPrinter printer = new OrderPrinter();
        printer.printShapesInOrder(shapes);

        assertEquals(1, shapes.get(0).getY());
        assertEquals(3, shapes.get(1).getY());
        assertEquals(5, shapes.get(2).getY());
    }
}
