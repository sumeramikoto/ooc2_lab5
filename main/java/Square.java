public class Square extends Shape {
    private double length;

    public Square(double x, double y, double length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}
