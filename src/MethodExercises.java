import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        addition(3, 4);
        subtraction(6, 4);
        multiplication(2, 3);
        divide(12, 2);
        remainder(6, 2);
//        getInteger(1, 10);

        Scanner scanner = new Scanner(System.in);
// calculateFactorial(4);
        factorialGame(scanner);


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
        if (!scanner.hasNextInt()) {
            System.out.println("That isn't even a number!");
            return getInteger(min, max);
        }
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("You entered " + userInput);
            return userInput;
        } else {
            System.out.println("Lets try that again!");
            return getInteger(min, max);
        }
    } // getInteger method close

    public static long calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i += 1) {
            factorial *= i;
        }
        System.out.println(factorial);
        return factorial;
    }


    public static void factorialGame(Scanner scanner) {
        boolean willContinue;
        String choice;

        System.out.println("Do you want to calculate the factorial of a number? (y/n): ");
        choice = scanner.nextLine();
        System.out.println(choice);

        do {
            System.out.println("Enter a integer between 1 and 10");
            int userInt = getInteger(1, 10);
            System.out.println(calculateFactorial(userInt));
        }
        while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));


    } // calculateFactorial close

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner scanner) {
        String choice;
        System.out.println("How many sides are on the dice?");
        int sides = getInteger(1, 20);
        do {
            System.out.println("You rolled a " +randomWithRange(1,sides) + "and a " + randomWithRange(1, sides));
            do {
                System.out.println("Wanna roll again? y/n?");
                choice = scanner.next();
            } while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));
        } while (!choice.equalsIgnoreCase("n"));
    } // rolldice close
} // MethodsExercises class close

