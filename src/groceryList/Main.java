package groceryList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Grocery List App");
        System.out.println("Would you like to make a new grocery list? y/n:");
        String choice = sc.nextLine();

//        Wrap in if statement based on answer to "Would you like to make a new list"
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Would you like to add a new item?");
        } else {
            System.out.println("Thank you for using the Grocery List App!");
        }

        choice = sc.nextLine();

        if (choice.equalsIgnoreCase("y")) {

            System.out.println("Please select a category for your item.\n" +
                    "1. Dairy\n" +
                    "2. Meat\n" +
                    "3. Produce\n" +
                    "4. Frozen\n" +
                    "5. Bakery\n" +
                    "6. Pantry\n" +
                    "7. Other");

            String category =

        } else {
            System.out.println("Thank you for using the Grocery List App!");
        }

    } //main method close
} //main class close
