package movies;

import util.Input;

public class MoviesApp {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    private static Movie [] movies;

    // movies = [Movie, Movie]


    public static void main(String[] args) {

        // go out and grab all them movies
        movies = MoviesArray.findAll();

        Input input = new Input();

        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while(choice != EXIT_CHOICE) {
            printMenu();

            choice = Input.getInt(0,5);

            doChoice(choice);

        }
    }

    private static void printMenu() {
        System.out.println(
                "What would you like to do?\n" +

                "0 - exit\n" +
                "1 - view all movies\n"+
                "2 - view movies in the animated category\n"+
                "3 - view movies in the drama category\n"+
                "4 - view movies in the horror category\n"+
                "5 - view movies in the scifi category\n"+

                "Enter your choice:");
    }

    private static void doChoice(int choice) {
        switch(choice) {
            case 1:
                printMoviesByCategory("all");
                break;
            case 2:
                printMoviesByCategory("animated");
                break;
            case 3:
                printMoviesByCategory("drama");
                break;
            case 4:
                printMoviesByCategory("horror");
                break;
            case 5:
                printMoviesByCategory("scifi");
                break;
        }
    }

    private static void printMoviesByCategory(String category) {
        for(Movie movie: movies) {
            if(movie.getCategory().equals(category) || category.equals("all")) {
                System.out.println(movie);
            }
        }
    }
}
