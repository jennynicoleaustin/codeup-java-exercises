package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;
        myShape = new Square(3);
        System.out.println("Quad " + "Area: " + myShape.getArea() + " " + "Perimeter " + myShape.getPerimeter());
        myShape = new Rectangle(3,4);
        System.out.println("Quad " + "Area: " + myShape.getArea() + " " + "Perimeter " + myShape.getPerimeter());

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
    }
}
