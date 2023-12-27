import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the jagged array
        System.out.print("Enter the number of sub-arrays: ");
        int numberOfArrays = input.nextInt();
        int[][] jaggedArray = new int[numberOfArrays][];
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfSubArray = input.nextInt();
            jaggedArray[i] = new int[sizeOfSubArray];
            System.out.println("Enter the elements of sub-array " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = input.nextInt();
            }
        }

        // Find the maximum element
        int max = jaggedArray[0][0];
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                if (jaggedArray[i][j] > max) {
                    max = jaggedArray[i][j];
                }
            }
        }

        System.out.println("The maximum element in the jagged array is: " + max);
    }
}
