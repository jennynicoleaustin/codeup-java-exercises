import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        addition(3, 4);
        subtraction(6, 4);
        multiplication(2, 3);
        divide(12, 2);
        remainder(6, 2);
//        getInteger(1, 10);

        factorialGame();
// calculateFactorial(4);


    } //main method close

    public static int addition(int x, int y) {
        int res = x + y;
        System.out.println(res);
        return res;
    } //addition method close

    public static int subtraction(int x, int y) {
        int res = x - y;
        System.out.println(res);
        return res;
    } //subtraction method close

    public static int multiplication(int x, int y) {
        int res = x * y;
        System.out.println(res);
        return res;
    } // multiplication method close

    public static int divide(int x, int y) {
        int res = x / y;
        System.out.println(res);
        return res;
    } // divide method close

    public static int remainder(int x, int y) {
        int res = x % y;
        System.out.println(res);
        return res;
    } // modulus method close

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();

        if (userInput < 1 || userInput > 10) {
            getInteger(min, max);
        } else {
            System.out.println("You entered " + userInput);
        }
        return userInput;
    } // getInteger method close

    public static int calculateFactorial(int userInput) {
        int factorial = 1;
        for (int i = 1; i <= userInput; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return factorial;
    }

    public static int factorialGame() {
        int factorial = 1;
        String choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to calculate the factorial of a number? (y/n): ");
        choice = scanner.nextLine();
        System.out.println(choice);

        while (choice.equalsIgnoreCase("y")) {
            int userInput;

            do {
               getInteger(1, 10);
                System.out.println(userInput);
                calculateFactorial(userInput);
            }
            while (userInput >= 1 && userInput <= 10);

    } //choice while close

        System.out.println("Did you make it?");
        return factorial;
} // calculateFactorial close

} // MethodsExercises class close

//        while (choice.equalsIgnoreCase("y")) {
//                int userInput;
//                userInput = getInteger(1, 10);
//                if (userInput < 1 || userInput > 10) {
//        for (int i = 1; i <= userInput; i++) {
//        factorial = factorial * i;
//        System.out.println(factorial);
//
//        }
//        choice = "n";
//        break;