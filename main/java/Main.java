import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Square(4, 5, 6);
        Shape shape2 = new Rectangle(4, 6, 3, 12);
        Shape shape3 = new Circle(4, 5, 3);
        Shape shape4 = new Square(1, 2, 10);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape1);
        shapeList.add(shape2);
        shapeList.add(shape3);
        shapeList.add(shape4);

        OrderPrinter printer = new OrderPrinter();

        printer.printShapesInOrder(shapeList);
    }
}
