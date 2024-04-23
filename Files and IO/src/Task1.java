import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        String line = "";
        String agree = "y";
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter text to be written:");
            line = scan.nextLine();
            try (Writer writ = new FileWriter("output.txt", true)) {
                writ.write("\n" + line);
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            System.out.println("Do you want to continue:(y/n)");
            agree = scan.nextLine();
        } while ("y".equals(agree));

        //File output
        System.out.println("Content of the file:");
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String lin = "";
            while ((lin = br.readLine()) != null) {
                System.out.println(lin);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
