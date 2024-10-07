import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    public void shapeInitializationTest() {
        Shape shape = new Square(4, 5, 6);
        assertNotNull(shape.getX());
        assertNotNull(shape.getY());
    }

    @Test
    public void squareAreaTest() {
        Shape shape = new Square(5, 5, 4);
        double expectedArea = 16;
        double resultingArea = shape.calculateArea();
        assertEquals(expectedArea, resultingArea);
    }

    @Test
    public void rectangleAreaTest() {
        Shape shape = new Rectangle(5, 5, 8, 5);
        double expectedArea = 40;
        double resultingArea = shape.calculateArea();
        assertEquals(expectedArea, resultingArea);
    }

    @Test
    public void circleAreaTest() {
        Shape shape = new Circle(5, 5, 6);
        double expectedArea = 3.1416 * 36;
        double resultingArea = shape.calculateArea();
        assertEquals(expectedArea, resultingArea);
    }

    @Test
    public void xTest() {
        Shape shape = new Square(4, 5, 6);
        double expectedX = 4;
        double resultingX = shape.getX();
        assertEquals(expectedX, resultingX);
    }

    @Test
    public void yTest() {
        Shape shape = new Square(4, 5, 6);
        double expectedY = 5;
        double resultingY = shape.getY();
        assertEquals(expectedY, resultingY);
    }
}
