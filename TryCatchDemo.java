import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            // Open a file for reading
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            // Read the contents of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the file
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file could not be found.");
        } finally {
            System.out.println("The program has finished executing.");
        }
    }
}

