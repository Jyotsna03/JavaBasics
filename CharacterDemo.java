import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterDemo {
    public static void main(String[] args) {
        try {
            // Create a FileReader object to read from a file
            FileReader reader = new FileReader("input.txt");

            // Create a FileWriter object to write to a file
            FileWriter writer = new FileWriter("output.txt");

            // Read characters from the input file and write them to the output file
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            // Close the streams
            reader.close();
            writer.close();

            System.out.println("Data has been read from input.txt and written to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
