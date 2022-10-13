package util;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

//    public Input() {
//        this.sc = new Scanner(System.in);
//    }

    public static String getString() {
        return sc.nextLine();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public static boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = sc.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    // Error handling version - which for the record is silly.
    public static int getIntErr(int min, int max, String prompt) {
        int input;
        try {
            do {
                System.out.println(prompt);
                input = Integer.parseInt(getString());
            } while (input < min || input > max);
            return input;
        } catch (NumberFormatException e) {
            System.out.println("Number format error");
            return getIntErr(min, max, prompt);
        }
    }


    public static int getInt(int min, int max, String prompt) {
        int input;
        do {
            System.out.println(prompt);
            input = sc.nextInt();
        } while (input < min || input > max);
        return input;
    }

    public static int getInt(int min, int max) {
        int input;
        do {
            input = sc.nextInt();
        } while (input < min || input > max);
        return input;
    }

    public static int getInt() {
        System.out.println("Enter an integer:");
        return sc.nextInt();

    }

    public static double getDouble(int i, int i1) {
        System.out.println("Enter an really big integer:");
        return sc.nextDouble();
    }

    public static double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double input;
        do {
            System.out.println(prompt);
            input = sc.nextDouble();
        } while (input < min || input > max);
        return input;
    }

}
