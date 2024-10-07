public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.1416 * radius * radius;
    }
}
