package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();

        Student ramaj = new Student("Ramaj");
        ramaj.addGrade(99);
        ramaj.addGrade(98);
        ramaj.addGrade(89);

        Student peter = new Student("Peter");
        peter.addGrade(80);
        peter.addGrade(90);
        peter.addGrade(95);

        Student jenny = new Student("Jenny");
        jenny.addGrade(99);
        jenny.addGrade(90);
        jenny.addGrade(88);

        Student eric = new Student("Eric");
        eric.addGrade(55);
        eric.addGrade(75);
        eric.addGrade(95);


        students.put("RamajTheTiger", ramaj);
        students.put("PeterTheGreat", peter);
        students.put("dinojennycodes", jenny);
        students.put("ericf", eric);

// User Interface
        String choice = "y";
    do {System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println(students.keySet());
        System.out.println("What student would you like to see more information on?");

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        if(students.get(username) == null) {
            System.out.println("No users with that username found");
        } else {
            System.out.println(students.get(username) + " Git username: " + username);
        }

        System.out.println("Do you wish to continue? y/n: ");
        choice = sc.nextLine();
    }
        while (choice.equalsIgnoreCase("y"));





    } // main method close


} // GradesApplication class close

