import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f", pi);
// Scanner class will not work with other things above it within the class.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter three words:");
        String wordOne = scanner.next();
        System.out.println(wordOne);
        String wordTwo = scanner.next();
        System.out.println(wordTwo);
        String wordThree = scanner.next();
        System.out.println(wordThree);
        scanner.nextLine();
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        System.out.println("Enter the length of your room");
        String length = scanner.nextLine();
        int lengthNum = Integer.parseInt(length);
        System.out.println("Enter the width of your room");
        String width = scanner.nextLine();
        int widthNum = Integer.parseInt(width);
        int area = lengthNum * widthNum;
        int parameter = (lengthNum * 2) + (widthNum * 2);
        System.out.format("The area of the room is %d, the parameter of the room is %d", area, parameter);



        scanner.close();



    }

}
