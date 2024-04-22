
import java.util.*;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String input");
        String str1=scan.nextLine();
        System.out.println(countWords(str1));
        System.out.println(countLines(str1));
        System.out.println(reverseText(str1));
        System.out.println(removeDuplicates(str1));
    }

    // Method to count words in the text
    private static int countWords(String text) {
        String[] wordCount = text.split("\\s+");
        return wordCount.length;
    }

    // Method to count lines in the text
    private static int countLines(String text) {
        String[] lines = text.split("\r\n|\r|\n");
        return lines.length;
    }

    // Method to reverse the text
    private static String reverseText(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    // Method to remove duplicate words from the text
    private static String removeDuplicates(String text) {
        String[] words = text.split("\\s+");
       Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        return String.join(" ", uniqueWords);
    }
}
