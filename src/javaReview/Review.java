package javaReview;

public class Review {

    public static int circumference (int radius) {
        return (int) (2 * Math.PI * radius);    }

    public static double circumference (double radius){
        return 2 * Math.PI * radius;
    }

    public static double total (double bill, double tipPercentage) {
        return (bill + ((tipPercentage*100) * bill));
    }

    public static void even (int num) {
        System.out.println();
    }
}
