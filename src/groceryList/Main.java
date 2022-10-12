package groceryList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Grocery List App");
        System.out.println("Would you like to make a new grocery list? y/n:");
        String choice = sc.nextLine();
        ArrayList<Item> groceryList = new ArrayList<>();


        if (choice.equalsIgnoreCase("y")) {
            groceryList = promptNewItem(sc);
// issue: if you say n to adding a new item it still asks if you want to finalize your list
            System.out.println("Are you ready to finalize your list? y/n:");
            String finalize = sc.nextLine();
            if (finalize.equalsIgnoreCase("y")) {
//                System.out.println(groceryList);
                finalizeList(groceryList);
            } else {
                groceryList = promptNewItem(sc);
            }
        } else {
            System.out.println("Thank you for using the Grocery List App!");
        }
// need to wrap this so it doesn't run if n is selected.


    } //main method close

    public static ArrayList<Item> promptNewItem(Scanner sc) {
        ArrayList<Item> groceryList = new ArrayList<>();
        String anotherItem;
        System.out.println("Would you like to add a new item? y/n:");
        anotherItem = sc.nextLine();
        while (anotherItem.equalsIgnoreCase("y")) {
            System.out.println("Please select a category for your item. Input the category number:\n" +
                    "1. Bakery\n" +
                    "2. Dairy\n" +
                    "3. Frozen\n" +
                    "4. Meat\n" +
                    "5. Other\n" +
                    "6. Pantry\n" +
                    "7. Produce\n");

            int categoryNum = sc.nextInt();
            sc.nextLine();
            String category = "";

            switch (categoryNum) {
                case 1:
                    category = "Bakery";
                    break;
                case 2:
                    category = "Dairy";
                    break;
                case 3:
                    category = "Frozen";
                    break;
                case 4:
                    category = "Meat";
                    break;
                case 5:
                    category = "Other";
                    break;
                case 6:
                    category = "Pantry";
                    break;
                case 7:
                    category = "Produce";
                    break;
            }


            System.out.println("Enter the name of the item:");
            String name = sc.nextLine().toLowerCase();


            System.out.println("How many?");
            int numItem = sc.nextInt();
            sc.nextLine();

            Item newItem = new Item(name, numItem, category);
            groceryList.add(newItem);
            System.out.println("The following has been added to your list: " + category + " | " + name + " | " + numItem);

            System.out.println("Would you like to add another new item? y/n:");
            anotherItem = sc.nextLine();
        }
        return groceryList;

    } // prompt New Item method close

    public static void finalizeList(ArrayList<Item> groceryList) {
        Collections.sort(groceryList, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Here is your finalized grocery list\n" +
                "---------------------\n");
        System.out.println("Bakery");
        groceryList.forEach(item -> {
            if (item.getCategory().equalsIgnoreCase("Bakery"))
                System.out.println(item.getName() + " | " + item.getNumItem() + "\n");
        }); //bakery foreach

        System.out.println("Dairy");
        groceryList.forEach(item -> {
            if (item.getCategory().equalsIgnoreCase("dairy"))
                System.out.println(item.getName() + " | " + item.getNumItem() + "\n");
        }); //dairy foreach

        System.out.println("Frozen");
        groceryList.forEach(item -> {
            if (item.getCategory().equalsIgnoreCase("frozen"))
                System.out.println(item.getName() + " | " + item.getNumItem() + "\n");
        }); //frozen foreach

        System.out.println("Meat");
        groceryList.forEach(item -> {
            if (item.getCategory().equalsIgnoreCase("meat"))
                System.out.println(item.getName() + " | " + item.getNumItem() + "\n");
        }); //meat foreach

        System.out.println("Other");
        groceryList.forEach(item -> {
            if (item.getCategory().equalsIgnoreCase("other"))
                System.out.println(item.getName() + " | " + item.getNumItem() + "\n");
        }); //other foreach

        System.out.println("Pantry");
        groceryList.forEach(item -> {
            if (item.getCategory().equalsIgnoreCase("pantry"))
                System.out.println(item.getName() + " | " + item.getNumItem() + "\n");
        }); //pantry foreach

        System.out.println("Produce");
        groceryList.forEach(item -> {
            if (item.getCategory().equalsIgnoreCase("produce"))
                System.out.println(item.getName() + " | " + item.getNumItem() + "\n");
        }); //produce foreach


        System.out.println(groceryList);
    }

//        for(Entry <Item, String> entry : groceryList.entrySet())
//        {
//            entry.getKey(). // to get all the values
//        }

} //main class close
