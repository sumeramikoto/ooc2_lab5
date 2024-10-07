import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderPrinterTest {
    @Test
    public void generalAreaOrderTest() {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(1, 1, 2));
        shapeList.add(new Square(0, 0, 3));
        shapeList.add(new Rectangle(2, 2, 2, 5));

        OrderPrinter printer = new OrderPrinter();
        printer.printShapesInOrder(shapeList);

        assertTrue(shapeList.get(0).calculateArea() < shapeList.get(1).calculateArea());
        assertTrue(shapeList.get(1).calculateArea() < shapeList.get(2).calculateArea());
    }

    @Test
    public void notEmptyOrderTest() {
        List<Shape> shapeList = new ArrayList<>();
        Shape shape = new Square(5, 6, 10);
        shapeList.add(shape);
        assertNotNull(shapeList.get(0));
    }

    @Test
    public void areaByXOrderTest() {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Square(3, 1, 4));
        shapeList.add(new Square(1, 2, 4));
        shapeList.add(new Square(2, 3, 4));

        OrderPrinter printer = new OrderPrinter();
        printer.printShapesInOrder(shapeList);

        assertEquals(1, shapeList.get(0).getX());
        assertEquals(2, shapeList.get(1).getX());
        assertEquals(3, shapeList.get(2).getX());
    }

    @Test
    public void areaByYOrderTest() {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Square(1, 5, 4));
        shapeList.add(new Square(1, 3, 4));
        shapeList.add(new Square(1, 1, 4));

        OrderPrinter printer = new OrderPrinter();
        printer.printShapesInOrder(shapeList);

        assertEquals(1, shapeList.get(0).getY());
        assertEquals(3, shapeList.get(1).getY());
        assertEquals(5, shapeList.get(2).getY());
    }
}
