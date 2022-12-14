package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return ((length * 2) + (width * 2));
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
//    private double width;
//    private double length;
//    private double area;
//
//    private double perimeter;
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//        this.area = width * length;
//        this.perimeter = (2 * width) + (2 * length);
//    }
//
//    public double getArea() {
//        return area;
//    }
//
//    public double getPerimeter() {
//        return perimeter;
//    }
}
