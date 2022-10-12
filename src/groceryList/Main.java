package groceryList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Grocery List App");
        System.out.println("Would you like to make a new grocery list? y/n:");
        String choice = sc.nextLine();
        HashMap<String, Item> groceryList = new HashMap<>();


        if (choice.equalsIgnoreCase("y")) {
            promptNewItem(sc);
        } else {
            System.out.println("Thank you for using the Grocery List App!");
        }
        System.out.println("Are you ready to finalize your list? y/n:");
        sc.nextLine();
        System.out.println(groceryList);


    } //main method close

    public static Map<String, Item> promptNewItem(Scanner sc) {
//        HashMap<String, Item> groceryList = new HashMap<>();
        String anotherItem;
        System.out.println("Would you like to add a new item? y/n:");
        anotherItem = sc.nextLine();
        while (anotherItem.equalsIgnoreCase("y")) {
            System.out.println("Please select a category for your item.\n" +
                    "1. Bakery\n" +
                    "2. Dairy\n" +
                    "3. Frozen\n" +
                    "4. Meat\n" +
                    "5. Other\n" +
                    "6. Pantry\n" +
                    "7. Produce\n");

            String category = sc.nextLine().toLowerCase();


            System.out.println("Enter the name of the item:");
            String item = sc.nextLine().toLowerCase();


            System.out.println("How many?");
            int numItem = sc.nextInt();
            sc.nextLine();

            Item newItem = new Item(item, numItem, category);
            groceryList.put(newItem, category);
            System.out.println(newItem);
//            System.out.println("The following has been added to your list: " + category + " | " + item + " | " + numItem);

            System.out.println("Would you like to add another new item? y/n:");
            anotherItem = sc.nextLine();
        }
        return groceryList;
    } // prompt New Item method close


} //main class close
