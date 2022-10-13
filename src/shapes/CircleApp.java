package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
    circleMaker();
    }

    public static void circleMaker(){
        boolean keepMaking = true;
       do {
           Circle yourCircle = new Circle(Input.getInt("Enter the radius of your circle: "));
           System.out.println(yourCircle.getCircumference());
           System.out.println("You've made " + Circle.getCircleCount());
           keepMaking = Input.yesNo("Do you want to make another circle?");
       } while (keepMaking == true);

    }

} // CircleApp CLASS close
