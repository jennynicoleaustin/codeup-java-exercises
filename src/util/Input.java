package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return this.sc.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.sc.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max, String prompt) {
        int input;
        do {
            System.out.println(prompt);
            input = this.sc.nextInt();
        } while (input < min || input > max);
        return input;
    }

    public int getInt() {
        System.out.println("Enter an integer:");
        return this.sc.nextInt();

    }

    public double getDouble(int i, int i1) {
        System.out.println("Enter an really big integer:");
        return this.sc.nextDouble();
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double input;
        do {
            System.out.println(prompt);
            input = this.sc.nextDouble();
        } while (input < min || input > max);
        return input;
    }
}
