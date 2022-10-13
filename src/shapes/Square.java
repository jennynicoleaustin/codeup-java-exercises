package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
//
//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(side, 2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return side * 4;
//
//    }
}
