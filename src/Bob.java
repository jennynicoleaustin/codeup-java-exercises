import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        String askBob = "Sure";
        String yellAtBob = "Whoa, chill out!";
        String emptyAddress = "Fine. Be that way!";
        String whatever = "Whatever.";

        System.out.println("Bob is in the room.");

        System.out.println("Do you want to talk to Bob? (y/n): ");
        choice = scanner.nextLine();

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Say something already!");
            String addressBob = scanner.nextLine();

            if (addressBob.endsWith("?")) {
                System.out.println(askBob);
            } else if (addressBob.endsWith("!")) {
                System.out.println(yellAtBob);
            } else if (addressBob.equals("")) {
                System.out.println(emptyAddress);
            } else {
                System.out.println(whatever);
            }
            System.out.println("Do you have something else to say to Bob? (y/n): ");
            choice = scanner.nextLine();

        }
    } //main close
} // class close
