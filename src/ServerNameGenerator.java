import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"incorrigible", "petty", "smart", "egotistical", "lazy", "unprofessional", "unqualified", "outdated", "disorganized", "unreasonable"};
    public static String[] nouns = {"desk", "pen", "laptop", "cup", "phone", "duck", "marker", "chair", "board", "tv"};


    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(getWord(adjectives) + " " + getWord(nouns));
    }

    public static String getWord(String[] words){
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(words.length);
        return words[randomIndex];
    }
}
