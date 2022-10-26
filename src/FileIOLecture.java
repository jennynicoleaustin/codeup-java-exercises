import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) throws IOException {

// These methods can be used outside the main method.

//        String directory = "data"; // name of directory - can be a single name, or can use other variables to define a path
        String filename = "info.txt"; // name of file
        String curDir = System.getProperty("user.dir"); // get current working directory (that the program lives in)
        String directory = curDir + "/myData/data"; // add the path you would like the directory to be created in and even add more folders you want created inside that directory.

        Path dataDirectory = Paths.get(directory); // create a directory before trying to add a file to it
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        List<String> groceryList = Arrays.asList("coffee", "sugar", "milk"); // make a new list
        Path filepath = Paths.get(directory, "groceries.txt"); // get the path you want the new file to be added to and create the file if it is not there
        Files.write(filepath, groceryList); // write the contents of groceryList to the groceries.txt file


// add items to a list without overwriting what is already

//        Files.write(
//                filepath,
//                Arrays.asList("milkbones"), // list with one item
//                StandardOpenOption.APPEND
//        );

//        List<String> groceryList = Files.readAllLines(filepath); // read everything inside the file

// loop through to print all the info inside groceries.txt file
        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

/* Where did it go???
 ------- Show current directory ------
       String curDir = System.getProperty("user.dir");
        System.out.println(curDir);
 */
        /* ---- Delete an empty directory ---

         */


    } // Main METHOD
} // FileIOLecture CLASS
