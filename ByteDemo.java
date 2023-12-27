import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDemo {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream object to read from a file
            FileInputStream inputStream = new FileInputStream("input.txt");

            // Create a FileOutputStream object to write to a file
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            // Read bytes from the input stream and write them to the output stream
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            // Close the streams
            inputStream.close();
            outputStream.close();

            System.out.println("Data has been read from input.txt and written to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
