package shapes;

public class Rectangle {
    private double width;
    private double length;
    private double area;

    private double perimeter;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.area = width * length;
        this.perimeter = (2 * width) + (2 * length);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
