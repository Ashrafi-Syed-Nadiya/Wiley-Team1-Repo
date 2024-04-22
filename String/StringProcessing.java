
import java.util.*;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String input");
        String str1=scan.nextLine();
        System.out.println("Words : "+ countWords(str1));
        System.out.println("Lines : "+countLines(str1));
        System.out.println("Reverse : "+reverseText(str1));
        System.out.println("Unique without duplicates : "+removeDuplicates(str1));
        String s = """
                Multi line string
                starts from next line of three inverted quotes.
                """;
    }

    // Method to count words in the text
    private static int countWords(String text) {
        String[] wordCount = text.split("\\s+");
        return wordCount.length;
        // return text.split("[\\s,]+".length;
    }

    // Method to count lines in the text
    private static int countLines(String text) {
        String[] lines = text.split("\r\n|\r|\n");
        return lines.length;
        //return (int)text.lines().count();
    }

    // Method to reverse the text
    private static String reverseText(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
        //return new StringBuilder(text).reverse().toString();
    }

    // Method to remove duplicate words from the text
    private static String removeDuplicates(String text) {
        String[] words = text.split("\\s+");
        //var words = text.split("[\\s,]+");
       Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        return String.join(" ", uniqueWords);
        //return strSet .stream().collect(Collectors.joining(" "));
    }
}
