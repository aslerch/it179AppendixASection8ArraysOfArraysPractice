import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    private static char [][] letters = new char[5][];
    private static int wordCount = 0;
    private static Scanner keyboard = new Scanner(System.in);

    public static void main (String [] args) {

        int selection  = -1;
        int ADD_WORD = 1, EXIT = 2;
        String menu = """
                1. add a new word
                2. exit""";
        while (selection != EXIT) {
            System.out.print(menu + "\nyour selection: ");
            selection = new Scanner(System.in).nextInt();
            if (selection == ADD_WORD) {
                if (wordCount >= letters.length)
                    System.out.println("there are no longer any spaces available for new words");
                if (wordCount < letters.length)
                    addWord();
            }
            if (selection == EXIT)
                System.out.println("thank you for using the word adder program");
            if (selection > 2)
                System.out.println("that was not one of the options");
        }
        for (int i = 0; i < wordCount; i++) {
            System.out.println(Arrays.toString(letters[i]));
        }

    }

    private static void addWord() {
        System.out.print("please enter a word: ");
        String word = new Scanner(System.in).next();
        letters [wordCount] = new char [word.length()];
        for (int i = 0; i < letters[wordCount].length; i++) {
            letters [wordCount] [i] = word.charAt(i);
        }
        wordCount++;
    }

}
