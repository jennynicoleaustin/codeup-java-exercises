package shapes;

import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean response = true;
        do {
            double radius = input.getDouble(1,200);
            Circle circle1 = new Circle(radius);

            System.out.println("the circumference is " + circle1.getCircumference());
            System.out.println("The area is " + circle1.getArea());

            response = input.yesNo("Do you want to calculate circle values again? y/n");
        } while (response);
        System.out.println("You have calculated circle values " + Circle.getCircleCount() + "times");

    }
}
