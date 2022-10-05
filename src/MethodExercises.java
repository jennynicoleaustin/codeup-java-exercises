import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        addition(3, 4);
        subtraction(6, 4);
        multiplication(2, 3);
        divide(12, 2);
        remainder(6, 2);

        getInteger(1, 10);

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
            System.out.println(userInput);
        }
        return userInput;
    } // getInteger method close

} // MethodsExercises class close
