abstract class Shape {
    public double x;
    public double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double calculateArea();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
