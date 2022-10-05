import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        // while loop
//        int i = 5;
//        while (i<=15) {
//            System.out.println(i);
//            i++;
//        }
//
//        // do while
//        int count = 0;
//        do {
//            System.out.println(count);
//            count += 2;
//        } while (count < 101);
//
//        do {
//            System.out.println(count);
//            count -= 5;
//        } while (count > -11);

//        int sqNum = 2;
//        do {
//            System.out.println(sqNum);
//            sqNum = (int) Math.pow(sqNum, 2);
//        } while (sqNum < 1_000_000);


//        for (int i=2; i <1_000_000; i = (int) Math.pow(i, 2)) {
//            System.out.println(i);
//        }

//        for (int i = 100; i > -10; i -=5) {
//            System.out.println(i);
//        }

        // Fizzbuzz

//        for (int i = 1; i <= 100; i++) {
//            if (i%3 == 0 && i%5 == 0) {
//                System.out.println("Fizzbuzz " + i);
//            } else if (i%3 == 0) {
//                System.out.println("Fizz " + i);
//            } else if (i%5 == 0) {
//                System.out.println("Buzz " + i);
//            } else {
//                System.out.println(i);
//            }
//        }
        // Table of Powers
        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter an Integer: ");
            int userInput = scanner.nextInt();

            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
            System.out.println("======" + "  " + "======" + "  " + "======");

            for (int i = 1; i <= userInput; i++) {
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow(i, 3);

                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;

                System.out.println(message);
                System.out.println();
            }
                // see if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = scanner.next();
                System.out.println();
            }

        //Number grades to letter grades
//        Scanner scanner = new Scanner(System.in);
//        String choice = "y";
//
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.println("Enter your grade: ");
//            int numGrade = scanner.nextInt();
//            scanner.nextLine();
//
//            if (numGrade <= 100 && numGrade >= 88) {
//                System.out.println("A");
//            } else if (numGrade <= 87 && numGrade >= 80) {
//                System.out.println("B");
//            } else if (numGrade <= 79 && numGrade >= 67) {
//                System.out.println("C");
//            } else if (numGrade <= 66 && numGrade >= 60) {
//                System.out.println("D");
//            } else if (numGrade <= 59 && numGrade >= 0) {
//                System.out.println("F");
//            } else {
//                System.out.println("Enter a value from 0 to 100");
//            }
//            System.out.println("Do you wish to continue?");
//            choice = scanner.next();
//            scanner.nextLine();
//        }

    } // main close
} //public class close

