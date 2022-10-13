package shapes;

public class Circle {

    private double radius;
    private static int circleCount = 0;


    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
    }

    public static int getCircleCount(){
        return circleCount;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius,2));
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }


} // Circle Class close


