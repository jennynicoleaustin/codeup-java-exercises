import java.util.Scanner;

public class HighLow {

    public static int numGuesses;
    public static int gameNum;

    public static void main(String[] args) {

    }
    public static void startGame() {
        boolean programRunning;
        boolean gameRunning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("High / Low Guessing Game");
        do {
            gameNum = randomWithRange(1, 100);
            System.out.println("Random number is " + gameNum);
            do {
                gameRunning = round(sc);
            } while (gameRunning);
            programRunning = again(sc).equals("y");
        } while (programRunning);
        System.out.println("Game Over!");
    }

    public static boolean round(Scanner sc) {
        boolean notOver = false;
        System.out.println("Enter your guess: ");
        int guess = getInteger(1,100);
        if (guess == gameNum) {
            System.out.println("No way you guessed it!");
        } else if (guess > gameNum) {
            System.out.println("Go lower!");
            numGuesses++;
            notOver = true;
            System.out.println("Thats guess number " + numGuesses);
        } else {
            System.out.println("Go higher!");
            notOver = true;
            numGuesses++;
            System.out.println("Thats guess number " + numGuesses);
        }
        return notOver;
    }
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

    public static String again(Scanner sc) {
        String choice;
        do {
            System.out.println("Do you want to play again? y/n?");
            choice = sc.next();
        } while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));
        return choice;
    }
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

} // highlow class closer
